package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Categoria;
import edu.eci.cvds.entities.Necesidad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NecesidadMapper {

    void registrarNecesidad(@Param("necesidad") Necesidad necesidad);
    void actualizarEstadoNecesidadPorID(@Param("ID")int ID,@Param("estado") String estado);
    List<Necesidad> consultarNecesidades();
    List<Necesidad> consultarNecesidadesPorEstado(@Param("estado") String estado);
    List<Necesidad> consultarNecesidadesPorCategoria(@Param("categoria") Categoria categoria);
    List<Necesidad> consultarNecesidadPorID(@Param("ID")int ID);
    void eliminarNecesidad(@Param("ID") int ID);
}
