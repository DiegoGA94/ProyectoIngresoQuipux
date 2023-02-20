package co.com.listareproduccion.ProyectoIngresoQuipux.manager.impl;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.listareproduccion.ProyectoIngresoQuipux.dao.IListaReproduccionDAO;
import co.com.listareproduccion.ProyectoIngresoQuipux.manager.IListaReproduccionManager;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.CancionLista;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

@Service
public class ListaReproduccionManagerImpl implements IListaReproduccionManager {
	
	@Autowired
	private IListaReproduccionDAO listaReproduccionDAO;

	@Override
	public List<ListaReproduccionDTO> findListasReproduccion() {
		List<ListaReproduccionDTO> listasReproduccion = listaReproduccionDAO.findListasReproduccion();
		return listasReproduccion;
	}

	@Override
	@Transactional
	public Response insertListaReproduccion(ListaReproduccionDTO listaReproduccion) {
		
		ListaReproduccion listaReproduccionInsert = new ListaReproduccion();
		
		CancionLista cancionLista = new CancionLista();
		
		//insertamos la lista de reproduccion
		listaReproduccionInsert.setNombre(listaReproduccion.getNombre());
		listaReproduccionInsert.setDescripcion(listaReproduccion.getDescripcion());
		boolean responseInsertLista = listaReproduccionDAO.insertListaReproduccion(listaReproduccionInsert);
		
		if(responseInsertLista ==true) {
			//insertar en la tabla relacion CancionList
			ListaReproduccion lista = findListaReproduccionEntity(listaReproduccion.getNombre());
			
			for(int i=0; i<listaReproduccion.getCanciones().size();i++) {
				
				cancionLista.setIdCancion(listaReproduccion.getCanciones().get(i));
				cancionLista.setIdListaReproduccion(lista);
				listaReproduccionDAO.insertCancionLista(cancionLista);
			}
			
			return Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON).build();
		}else {
			return Response.status(Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).build();
		}
	}

	@Override
	public ListaReproduccionDTO findListaReproduccion(String nombreLista) {
		ListaReproduccionDTO listaReproduccionDTO = listaReproduccionDAO.findListaReproduccion(nombreLista);
		return listaReproduccionDTO;
	}
	
	@Override
	public ListaReproduccion findListaReproduccionEntity(String nombreLista) {
		ListaReproduccion listaReproduccion = listaReproduccionDAO.findListaReproduccionEntity(nombreLista);
		return listaReproduccion;
	}

	@Override
	@Transactional
	public Response eliminarListaReproduccion(String nombreLista) {
		boolean responseInsertLista = listaReproduccionDAO.eliminarListaReproduccion(nombreLista);
		if(responseInsertLista == true) {
			return Response.status(Status.CREATED).build();
		}else {
			return Response.status(Status.BAD_REQUEST).build();
		}
	}

}
