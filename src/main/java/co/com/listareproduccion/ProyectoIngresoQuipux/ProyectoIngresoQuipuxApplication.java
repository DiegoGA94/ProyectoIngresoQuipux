package co.com.listareproduccion.ProyectoIngresoQuipux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProyectoIngresoQuipuxApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoIngresoQuipuxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate.execute("DROP TABLE CANCION IF EXISTS");
		jdbcTemplate.execute("DROP TABLE LISTA_REPRODUCCION IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE CANCION(ID_CANCION INTEGER(11) PRIMARY KEY auto_increment,"
				+ "TITULO VARCHAR(30) NOT NULL, ARTISTA VARCHAR(30) NOT NULL, ALBUM VARCHAR(30) NOT NULL,"
				+ "ANNO VARCHAR(30) NOT NULL, GENERO VARCHAR NOT NULL)");
		jdbcTemplate.execute("CREATE TABLE LISTA_REPRODUCCION(ID_LISTA_REPRODUCCION INTEGER(11) PRIMARY KEY AUTO_INCREMENT,"
				+ "NOMBRE VARCHAR(30) NOT NULL, DESCRIPCION VARCHAR(30) NOT NULL) ");
		jdbcTemplate.execute("CREATE TABLE CANCION_LISTA(ID_CANCION_LISTA INTEGER(11) PRIMARY KEY AUTO_INCREMENT,"
				+ "ID_CANCION INTEGER(11) NOT NULL, ID_LISTA_REPRODUCCION INTEGER(11) NOT NULL) ");
		for(int i=0; i<10; i++ ) {
		jdbcTemplate.update("INSERT INTO CANCION(TITULO, ARTISTA, ALBUM, ANNO, GENERO) VALUES ('CANCION00"+i+"', 'ARTISTA00"+i+"', 'ALBUM00"+i+"', '2008', 'POP') ");
		}
		
		jdbcTemplate.update("INSERT INTO LISTA_REPRODUCCION(NOMBRE, DESCRIPCION) VALUES ('LISTA 1', 'Lista de reproduccion 1') ");
		jdbcTemplate.update("INSERT INTO LISTA_REPRODUCCION(NOMBRE, DESCRIPCION) VALUES ('LISTA 2', 'Lista de reproduccion 2') ");
		jdbcTemplate.update("INSERT INTO LISTA_REPRODUCCION(NOMBRE, DESCRIPCION) VALUES ('LISTA 3', 'Lista de reproduccion 3') ");
		jdbcTemplate.update("INSERT INTO LISTA_REPRODUCCION(NOMBRE, DESCRIPCION) VALUES ('LISTA 4', 'Lista de reproduccion 4') ");
		
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION001', 'Lista de reproduccion 1') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION002', 'Lista de reproduccion 1') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION003', 'Lista de reproduccion 1') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION004', 'Lista de reproduccion 1') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION004', 'Lista de reproduccion 2') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION003', 'Lista de reproduccion 2') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION005', 'Lista de reproduccion 2') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION006', 'Lista de reproduccion 2') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION005', 'Lista de reproduccion 3') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION006', 'Lista de reproduccion 3') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION007', 'Lista de reproduccion 3') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION008', 'Lista de reproduccion 3') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION007', 'Lista de reproduccion 4') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION009', 'Lista de reproduccion 4') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION0010', 'Lista de reproduccion 4') ");
		jdbcTemplate.update("INSERT INTO CANCION_LISTA(ID_CANCION, ID_LISTA_REPRODUCCION) VALUES ('CANCION0011', 'Lista de reproduccion 4') ");
		
		
	}

}
