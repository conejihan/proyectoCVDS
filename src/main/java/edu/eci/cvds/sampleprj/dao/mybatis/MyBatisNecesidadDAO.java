package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Categoria;
import edu.eci.cvds.entities.Necesidad;
import edu.eci.cvds.sampleprj.dao.NecesidadDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.NecesidadMapper;

import java.util.List;

public class MyBatisNecesidadDAO implements NecesidadDAO{
    //@Inject
    NecesidadMapper necesidadMapper;

    @Override
    public void registrarNecesidad(Necesidad necesidad){
        necesidadMapper.registrarNecesidad(necesidad);
    }

    @Override
    public void actualizarEstadoNecesidadPorID(int ID, String estado) {
        necesidadMapper.actualizarEstadoNecesidadPorID(ID,estado);
    }

    @Override
    public List<Necesidad> consultarNecesidades() {
        return necesidadMapper.consultarNecesidades();
    }

    @Override
    public List<Necesidad> consultarNecesidadesPorEstado(String estado) {
        return necesidadMapper.consultarNecesidadesPorEstado(estado);
    }

    @Override
    public List<Necesidad> consultarNecesidadesPorCategoria(Categoria categoria) {
        return necesidadMapper.consultarNecesidadesPorCategoria(categoria);
    }

    @Override
    public List<Necesidad> consultarNecesidadPorID(int ID) {
        return necesidadMapper.consultarNecesidadPorID(ID);
    }

    @Override
    public void eliminarNecesidad(int ID) {
        necesidadMapper.eliminarNecesidad(ID);
    }
}
