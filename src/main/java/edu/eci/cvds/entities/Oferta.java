package edu.eci.cvds.entities;

/**
 * @author Juan Camilo Gil
 * @author Leidy Marcela Ducuara
 * @author Nicolas Medina
 * @author Brayan Andres Macias
 * @author Juan Camilo Molina
 */
public class Oferta{
	private int ID;
	private Categoria categoria;
	private String nombre;
	private String descripcion;
	private String fechaCreacion;
	private String estado;
	private String fechaModificacion;

	public Oferta(){}

	public Oferta(int ID, String nombre, String descripcion, String fechaCreacion, String estado, String fechaModificacion){
		this.ID   = ID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		this.fechaModificacion = fechaModificacion;
	}


	public int getID(){
		return ID;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public Categoria getCategoria(){
		return categoria;
	}

	public void setCategoria(Categoria categoria){
		this.categoria = categoria;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}


	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public String fechaCreacion(){
		return fechaCreacion;
	}

	public void setFechaActualizacion(String fechaCreacion){
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getFechaModificacion(){
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion){
		this.fechaModificacion = fechaModificacion;
	}
}