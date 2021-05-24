package edu.eci.cvds.entities;

/**
 * @author Juan Camilo Gil
 * @author Leidy Marcela Ducuara
 * @author Nicolas Medina
 * @author Brayan Andres Macias
 * @author Juan Camilo Molina
 */
public class Categoria{
	private int id_categoria;
	private String nombre;
	private String descripcion;
	private String estado;
	private int usuario;
	private String fechaCreacion;
	private String fechaModificacion;

	public Categoria(){}

	public Categoria(int id_categoria, String nombre, String descripcion, String estado, int usuario, String fechaCreacion, String fechaModificacion){
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuario = usuario;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
}