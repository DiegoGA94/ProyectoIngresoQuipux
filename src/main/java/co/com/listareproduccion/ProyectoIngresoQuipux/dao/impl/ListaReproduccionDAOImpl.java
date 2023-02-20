package co.com.listareproduccion.ProyectoIngresoQuipux.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.listareproduccion.ProyectoIngresoQuipux.dao.IListaReproduccionDAO;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.CancionLista;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccion;
import co.com.listareproduccion.ProyectoIngresoQuipux.models.ListaReproduccionDTO;


@Repository
public class ListaReproduccionDAOImpl implements IListaReproduccionDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ListaReproduccionDTO> findListasReproduccion() {
		Query query = em.createNativeQuery("SELECT lr.nombre as nombre, lr.descripcion as descripcion, (select"
				+ " ca.titulo, ca.artista, ca.album, ca.anno, ca.genero FROM CANCION"
				+ "inner join CANCION_LISTA cl ON ca.id_cancion = cl.id_cancion) as cancionesLista FROM LISTA_REPRODUCCION lr"
				+ "INNER JOIN CANCION_LISTA cl ON lr.ID_LISTA_REPRODUCCION = cl.ID_LISTA_REPRODUCCION", "ListaReproduccionDTO");
		
		List<ListaReproduccionDTO> listaReproduccion = query.getResultList();
		return listaReproduccion;
	}

	@Override
	public boolean insertListaReproduccion(ListaReproduccion listaReproduccion) {
		try {
			em.merge(listaReproduccion);
			em.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean insertCancionLista(CancionLista cancionLista) {
		try {
			em.merge(cancionLista);
			em.flush();
			return true;
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
	

	@Override
	public ListaReproduccionDTO findListaReproduccion(String nombreLista) {
		Query query = em.createNativeQuery("Select NOMBRE, DESCRIPCION FROM LISTA_REPRODUCCION WHERE NOMBRE = #nombre ", "ListaReproduccionDTO");
		ListaReproduccionDTO listaReproduccionDTO =  (ListaReproduccionDTO) query.getSingleResult();
		return listaReproduccionDTO;
	}

	@Override
	public boolean eliminarListaReproduccion(String nombreLista) {
		try {
			ListaReproduccion lista = this.findListaReproduccionEntity(nombreLista);
			Query query1 = em.createNativeQuery("DELETE FROM CANCION_LISTA WHERE ID_LISTA_REPRODUCCION = #idListaReproduccion");
			query1.setParameter("idListaReproduccion", lista.getIdListaReproduccion());
			query1.executeUpdate();
			Query query = em.createNativeQuery("DELETE FROM LISTA_REPRODUCCION WHERE ID_LISTA_REPRODUCCION = #idListaReproduccion");
			query.setParameter("idListaReproduccion", lista.getIdListaReproduccion());
			query.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ListaReproduccion findListaReproduccionEntity(String nombreLista) {
		Query query = em.createNativeQuery("Select ID_LISTA_REPRODUCCION, NOMBRE, DESCRIPCION FROM LISTA_REPRODUCCION WHERE NOMBRE = #nombre", ListaReproduccion.class);
		query.setParameter("nombre", nombreLista);
		ListaReproduccion listaRe = (ListaReproduccion) query.getSingleResult();
		return listaRe;
	}

}
