package co.com.listareproduccion.ProyectoIngresoQuipux.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.listareproduccion.ProyectoIngresoQuipux.manager.IListaReproduccionManager;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.Cancion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

public class ListaReproduccionManagerImpl implements IListaReproduccionManager {

	@Override
	public List<ListaReproduccionDTO> findListasReproduccion() {
		
		return null;
	}

	@Override
	public Response insertListaReproduccion(Cancion cancion, ListaReproduccion listaReproduccion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaReproduccionDTO findListaReproduccion(String nombreLista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response eliminarListaReproduccion(String nombreLista) {
		// TODO Auto-generated method stub
		return null;
	}

}
