package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Oferta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OfertaDAO{

	void registrarOferta(Oferta oferta);
	void actualizarEstadoOfertaPorID(int ID, String estado);
	List<Oferta> consultarOfertas();
	List<Oferta> consultarOfertasPorEstado(String estado);
	void eliminarOferta(int ID);
}