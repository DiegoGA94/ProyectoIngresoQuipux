package co.com.listareproduccion.ProyectoIngresoQuipux.models;

import java.io.Serializable;
import java.util.List;

public class ListaReproduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8427722184351264437L;
	
	private String nombre;
	private String descripcion;
	private List<Cancion> cancionesLista;
	
	
	
	public ListaReproduccionDTO(int idListaReproduccion, String nombre, String descripcion,
			List<Cancion> cancionesLista) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cancionesLista = cancionesLista;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Cancion> getCancionesLista() {
		return cancionesLista;
	}
	public void setCancionesLista(List<Cancion> cancionesLista) {
		this.cancionesLista = cancionesLista;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
