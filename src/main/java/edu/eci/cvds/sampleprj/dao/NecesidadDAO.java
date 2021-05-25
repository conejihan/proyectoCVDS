package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Categoria;
import edu.eci.cvds.entities.Necesidad;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface NecesidadDAO{

	void registrarNecesidad(Necesidad necesidad);
	void actualizarEstadoNecesidadPorID(int ID,String estado);
	List<Necesidad> consultarNecesidades();
	List<Necesidad> consultarNecesidadesPorEstado(String estado);
	List<Necesidad> consultarNecesidadesPorCategoria(Categoria categoria);
	List<Necesidad> consultarNecesidadPorID(int ID);
	void eliminarNecesidad(int ID);
}