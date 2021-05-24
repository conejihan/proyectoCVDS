package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Necesidad;

import java.util.List;


public interface NecesidadDAO{

	void registrarNecesidad(Necesidad necesidad);
	void actualizarEstadoNecesidadPorID(int ID,String estado);
	List<Necesidad> consultarNecesidades();
	List<Necesidad> consultarNecesidadesPorEstado(String estado);


}