package edu.eci.cvds.servicios;

import edu.eci.cvds.entities.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface serviciosSolidaridad {

    public abstract void crearCategoria(int id_categoria ,String nombre,String descripcion ,String estado);
    public abstract List<Categoria> consultarCategorias();
    public abstract void actualizarCategoriaPorID(int Id, String nombre, String descripcion, String estado);
    public abstract void eliminarCategoria(Categoria categoria);
    public abstract List<Categoria> consultarCategoriaPorID(int id);
    public abstract List<Categoria> consultarCategoriaPorNombre(String nombre);



}
