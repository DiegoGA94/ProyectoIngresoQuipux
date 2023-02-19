package co.com.listareproduccion.ProyectoIngresoQuipux.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "LISTA_REPRODUCCION")
public class ListaReproduccion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9218081663948527996L;
	
	@Id
	@Column(name = "ID_LISTA_REPRODUCCION")
	private int idListaReproduccion;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	
	
	public ListaReproduccion(int idListaReproduccion, String nombre, String descripcion, List<Cancion> canciones) {
		super();
		this.idListaReproduccion = idListaReproduccion;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public ListaReproduccion() {
		// TODO Auto-generated constructor stub
	}

	public int getIdListaReproduccion() {
		return idListaReproduccion;
	}
	public void setIdListaReproduccion(int idListaReproduccion) {
		this.idListaReproduccion = idListaReproduccion;
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
	
	
	

}
