package co.com.listareproduccion.ProyectoIngresoQuipux.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

public interface IListaReproduccionManager {
	
	List<ListaReproduccionDTO> findListasReproduccion();
	
	Response insertListaReproduccion(ListaReproduccionDTO listaReproduccion);

	ListaReproduccionDTO findListaReproduccion(String nombreLista);
	
	Response eliminarListaReproduccion(String nombreLista);

	ListaReproduccion findListaReproduccionEntity(String nombreLista);

}
