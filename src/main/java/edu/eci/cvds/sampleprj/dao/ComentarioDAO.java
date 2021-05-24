package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Comentario;
import java.util.List;
import edu.eci.cvds.entities.Respuesta;

public interface ComentarioDAO {

	void registrarComentario(Comentario comentario);
	List<Comentario> consultarComentarios();
	List<Comentario> consultarComentariosPorRespuesta(Respuesta respuesta);
}
