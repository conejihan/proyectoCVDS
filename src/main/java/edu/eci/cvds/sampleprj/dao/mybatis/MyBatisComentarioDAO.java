package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Respuesta;
import edu.eci.cvds.sampleprj.dao.ComentarioDAO;
import edu.eci.cvds.entities.Comentario;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ComentarioMapper;

import java.util.List;

public class MyBatisComentarioDAO implements ComentarioDAO{
    //@Inject
    ComentarioMapper comentarioMapper;

    @Override
    public void registrarComentario(Comentario comentario) {
        comentarioMapper.registrarComentario(comentario);
    }

    @Override
    public List<Comentario> consultarComentariosPorRespuesta(Respuesta respuesta) {
        return comentarioMapper.consultarComentariosPorRespuesta(respuesta);
    }

    @Override
    public List<Comentario> consultarComentarios() {
        return comentarioMapper.consultarComentarios();
    }
}
