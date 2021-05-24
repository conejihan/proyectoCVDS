package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Necesidad;
import edu.eci.cvds.entities.Oferta;
import edu.eci.cvds.entities.Respuesta;
import edu.eci.cvds.sampleprj.dao.RespuestaDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.RespuestaMapper;

import java.util.List;

public class MyBatisRespuestaDAO implements RespuestaDAO{
    //@Inject
    RespuestaMapper respuestaMapper;

    @Override
    public void registrarRespuesta(Respuesta respuesta) {
        respuestaMapper.registrarRespuesta(respuesta);
    }

    @Override
    public List<Respuesta> consultarRespuestasPorOferta(Oferta oferta) {
        return respuestaMapper.consultarRespuestasPorOferta(oferta);
    }
}
