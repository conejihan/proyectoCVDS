package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Oferta;
import edu.eci.cvds.entities.Respuesta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RespuestaMapper {

    void registrarRespuesta(@Param("respuesta") Respuesta respuesta);
    List<Respuesta> consultarRespuestasPorOferta(@Param("oferta") Oferta oferta);
}
