package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Oferta;
import edu.eci.cvds.entities.Respuesta;

import java.util.List;

public interface RespuestaDAO {

    void registrarRespuesta(Respuesta respuesta);
    List<Respuesta> consultarRespuestasPorOferta(Oferta oferta);
}
