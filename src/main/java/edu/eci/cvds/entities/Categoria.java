package edu.eci.cvds.entities;

import java.time.LocalDate;
import java.sql.Date;

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
	private Date fechaCreacion;
	private Date fechaModificacion;
	private LocalDate hoy = LocalDate.now();

	public Categoria(){}
	public Categoria(int id_categoria ,String nombre,String descripcion ,String estado){
		this.id_categoria=id_categoria;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.estado=estado;
		this.fechaCreacion = Date.valueOf(hoy);
		this.fechaModificacion = Date.valueOf(hoy);
	}

	public Categoria(int id_categoria, String nombre, String descripcion, String estado, int usuario, Date fechaCreacion, Date fechaModificacion){
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
}