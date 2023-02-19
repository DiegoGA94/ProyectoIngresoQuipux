package co.com.listareproduccion.ProyectoIngresoQuipux.dao.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Repository;

import co.com.listareproduccion.ProyectoIngresoQuipux.dao.IListaReproduccionDAO;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.Cancion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class ListaReproduccionDAOImpl implements IListaReproduccionDAO {

	
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ListaReproduccionDTO> findListasReproduccion() {
		Query query = em.createNativeQuery("SELECT lr.nombre as nombre, lr.descripcion as descripcion, (select"
				+ " ca.titulo, ca.artista, ca.album, ca.anno, ca.genero FROM CANCION"
				+ "inner join CANCION_LISTA cl ON ca.id_cancion = cl.id_cancion) as cancionesLista FROM LISTA_REPRODUCCION lr"
				+ "INNER JOIN CANCION_LISTA cl ON lr.ID_LISTA_REPRODUCCION = cl.ID_LISTA_REPRODUCCION", "ListaReproduccionDTO");
		
		List<ListaReproduccionDTO> listaReproduccion = query.getResultList();
		return listaReproduccion;
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
