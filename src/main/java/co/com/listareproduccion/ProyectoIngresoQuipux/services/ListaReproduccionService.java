package co.com.listareproduccion.ProyectoIngresoQuipux.services;

import org.springframework.stereotype.Component;

import co.com.listareproduccion.ProyectoIngresoQuipux.manager.IListaReproduccionManager;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.Cancion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("listaReproduccion")
public class ListaReproduccionService {

	private IListaReproduccionManager listaReproduccionManager;
	
	@GET
	@Path("lists")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<ListaReproduccionDTO> findListasReproduccion(){
		return listaReproduccionManager.findListasReproduccion() ;
	}
	
	@POST
	@Path("lists")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertListaReproduccion(ListaReproduccionDTO listaReproduccion){
		return listaReproduccionManager.insertListaReproduccion(listaReproduccion) ;
	}
	
	@GET
	@Path("lists/{listName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ListaReproduccionDTO findListaReproduccion(@PathParam("listName") String nombreLista){
		return listaReproduccionManager.findListaReproduccion(nombreLista) ;
	}
	
	@DELETE
	@Path("lists/{listName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteListaReproduccion(@PathParam("listName") String nombreLista){
		return listaReproduccionManager.eliminarListaReproduccion(nombreLista);
	}
	
}
