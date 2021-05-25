package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Categoria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriaMapper {

    void crearCategoria(@Param("Categoria") Categoria categoria);
    void actualizarCategoriaPorID(@Param("ID") int Id,@Param("nombre") String nombre,@Param("descripcion") String descripcion,@Param("estado") String estado);
    List<Categoria> consultarCategorias();
    void eliminarCategoria(@Param("Categoria") Categoria categoria);
}
