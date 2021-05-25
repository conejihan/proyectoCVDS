package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Oferta;
import edu.eci.cvds.sampleprj.dao.OfertaDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.OfertaMapper;

import java.util.List;

public class MyBatisOfertaDAO implements OfertaDAO{
    //@Inject
    private OfertaMapper ofertaMapper;

    @Override
    public void registrarOferta(Oferta oferta){
        ofertaMapper.registrarOferta(oferta);
    }

    @Override
    public void actualizarEstadoOfertaPorID(int ID, String estado){
        ofertaMapper.actualizarEstadoOfertaPorID(ID,estado);
    }

    @Override
    public List<Oferta> consultarOfertas() {
        return ofertaMapper.consultarOfertas();
    }

    @Override
    public List<Oferta> consultarOfertasPorEstado(String estado) {
        return ofertaMapper.consultarOfertasPorEstado(estado);
    }

    @Override
    public void eliminarOferta(int ID) {
        ofertaMapper.eliminarOferta(ID);
    }
}
