package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Oferta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OfertaMapper {

    void registrarOferta(@Param("oferta") Oferta oferta);
    void actualizarEstadoOfertaPorID(@Param("ID") int Id,@Param("estado") String estado);
    List<Oferta> consultarOfertas();
    List<Oferta> consultarOfertasPorEstado(@Param("estado") String estado);
    void eliminarOferta(@Param("ID") int ID);
}
