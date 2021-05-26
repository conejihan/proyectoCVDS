package edu.eci.cvds.servicios.impl;

import edu.eci.cvds.entities.Categoria;
import  edu.eci.cvds.servicios.serviciosSolidaridad;
import  edu.eci.cvds.sampleprj.dao.*;
import edu.eci.cvds.entities.*;
import com.google.inject.Inject;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public class serviciosSolidaridadIMPL implements serviciosSolidaridad {
    private CategoriaDAO categoriaDAO;


    public void crearCategoria(int id_categoria, String nombre, String descripcion, String estado) {
        categoriaDAO.crearCategoria(new Categoria(id_categoria, nombre, descripcion, estado));


    }

    public List<Categoria> consultarCategorias() {
        return categoriaDAO.consultarCategorias();


    }

    public void actualizarCategoriaPorID(int Id, String nombre, String descripcion, String estado) {


    }

    public void eliminarCategoria(Categoria categoria) {
        categoriaDAO.eliminarCategoria(categoria);

    }

    public List<Categoria> consultarCategoriaPorNombre(String nombre) {
       return categoriaDAO.consultarCategoriaPorNombre(nombre);
    }

    public List<Categoria> consultarCategoriaPorID(int id) {
        return  categoriaDAO.consultarCategoriaPorID(id);

    }






}
