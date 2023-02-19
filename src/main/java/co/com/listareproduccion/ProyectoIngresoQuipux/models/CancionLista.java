package co.com.listareproduccion.ProyectoIngresoQuipux.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CANCION_LISTA")
public class CancionLista {
	
	@Id
	@Column(name = "ID_CANCION_LISTA")
	private int idCancionLista;
	@ManyToOne
	@JoinColumn(name = "ID_CANCION")
	private int idCancion;
	@ManyToOne
	@JoinColumn(name = "ID_LISTA_REPRODUCCION")
	private int idListaReproduccion;
	
	
	public CancionLista(int idCancionLista, int idCancion, int idListaReproduccion) {
		super();
		this.idCancionLista = idCancionLista;
		this.idCancion = idCancion;
		this.idListaReproduccion = idListaReproduccion;
	}
	
	public int getIdCancionLista() {
		return idCancionLista;
	}
	public void setIdCancionLista(int idCancionLista) {
		this.idCancionLista = idCancionLista;
	}
	public int getIdCancion() {
		return idCancion;
	}
	public void setIdCancion(int idCancion) {
		this.idCancion = idCancion;
	}
	public int getIdListaReproduccion() {
		return idListaReproduccion;
	}
	public void setIdListaReproduccion(int idListaReproduccion) {
		this.idListaReproduccion = idListaReproduccion;
	}
	
	
	

}
