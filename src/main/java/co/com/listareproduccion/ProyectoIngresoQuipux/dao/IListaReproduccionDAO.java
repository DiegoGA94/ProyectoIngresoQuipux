package co.com.listareproduccion.ProyectoIngresoQuipux.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.listareproduccion.ProyectoIngresoQuipux.models.CancionLista;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

public interface IListaReproduccionDAO {
	
	List<ListaReproduccionDTO> findListasReproduccion();
	
	boolean insertListaReproduccion(ListaReproduccion listaReproduccion);

	ListaReproduccionDTO findListaReproduccion(String nombreLista);
	
	boolean eliminarListaReproduccion(String nombreLista);

	boolean insertCancionLista(CancionLista cancionLista);

	ListaReproduccion findListaReproduccionEntity(String nombreLista);
}
