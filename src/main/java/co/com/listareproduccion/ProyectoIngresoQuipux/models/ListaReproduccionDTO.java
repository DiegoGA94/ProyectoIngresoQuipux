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
	private List<Cancion> canciones;
	
	
	
	public ListaReproduccionDTO(int idListaReproduccion, String nombre, String descripcion,
			List<Cancion> canciones) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.canciones = canciones;
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
	public List<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
