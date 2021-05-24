package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.entities.Respuesta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComentarioMapper {

	void registrarComentario(@Param("comentario") Comentario comentario);
	List<Comentario> consultarComentarios();
	List<Comentario> consultarComentariosPorRespuesta(@Param("respuesta") Respuesta respuesta);
}