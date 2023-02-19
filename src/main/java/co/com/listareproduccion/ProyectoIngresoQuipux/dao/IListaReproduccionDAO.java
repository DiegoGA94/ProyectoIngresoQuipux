package co.com.listareproduccion.ProyectoIngresoQuipux.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.listareproduccion.ProyectoIngresoQuipux.models.Cancion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

public interface IListaReproduccionDAO {
	
	List<ListaReproduccionDTO> findListasReproduccion();
	
	Response insertListaReproduccion(Cancion cancion, ListaReproduccion listaReproduccion);

	ListaReproduccionDTO findListaReproduccion(String nombreLista);
	
	Response eliminarListaReproduccion(String nombreLista);
}
