package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriaDAO;
import edu.eci.cvds.entities.Categoria;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.CategoriaMapper;

import java.util.List;

public class MyBatisCategoriaDAO implements CategoriaDAO {
    //@Inject
    private CategoriaMapper categoriaMapper;

    @Override
    public void crearCategoria(Categoria categoria){
        categoriaMapper.crearCategoria(categoria);
    }

    @Override
    public void actualizarCategoriaPorID(int Id, String nombre, String descripcion, String estado){
        categoriaMapper.actualizarCategoriaPorID(Id,nombre,descripcion,estado);
    }

    @Override
    public List<Categoria> consultarCategorias() {
        return categoriaMapper.consultarCategorias();
    }
}
