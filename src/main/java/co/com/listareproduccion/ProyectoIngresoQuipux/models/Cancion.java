package co.com.listareproduccion.ProyectoIngresoQuipux.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CANCION")
public class Cancion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8080450907543908352L;
	
	@Id
	@Column(name = "ID_CANCION")
	private int idCancion;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "ARTISTA")
	private String artista;
	@Column(name = "ALBUM")
	private String album;
	@Column(name = "ANNO")
	private String anno;
	@Column(name = "GENERO")
	private String genero;
	
	
	
	public Cancion(int idCancion, String titulo, String artista, String album, String anno, String genero) {
		super();
		this.idCancion = idCancion;
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		this.anno = anno;
		this.genero = genero;
	}
	
	public int getIdCancion() {
		return idCancion;
	}
	public void setIdCancion(int idCancion) {
		this.idCancion = idCancion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	

}
