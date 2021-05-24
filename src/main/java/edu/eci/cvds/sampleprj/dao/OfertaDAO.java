package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Oferta;
import java.util.List;

public interface OfertaDAO{

	void registrarOferta(Oferta oferta);
	void actualizarEstadoOfertaPorID(int ID, String estado);
	List<Oferta> consultarOfertas();
	List<Oferta> consultarOfertasPorEstado(String estado);
}