package co.com.listareproduccion.ProyectoIngresoQuipux.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	public CancionLista() {
		// TODO Auto-generated constructor stub
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
