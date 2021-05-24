package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Categoria;
import java.util.List;

public interface CategoriaDAO{

	void crearCategoria(Categoria categoria);
	void actualizarCategoriaPorID(int Id, String nombre, String descripcion, String estado);
	List<Categoria> consultarCategorias();
}