package edu.eci.cvds.entities;

/**
 * @author Juan Camilo Gil
 * @author Leidy Marcela Ducuara
 * @author Nicolas Medina
 * @author Brayan Andres Macias
 * @author Juan Camilo Molina
 */
public class Respuesta {
    private int id_respuesta;
    private String titulo;
    private String descripcion;
    private int oferta;
    private int necesidad;
    private int usuario;

    public Respuesta(){}

    public Respuesta(int id_respuesta, String titulo, String descripcion, int oferta, int necesidad, int usuario){
        this.id_respuesta = id_respuesta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.oferta = oferta;
        this.necesidad = necesidad;
        this.usuario = usuario;
    }

    public int getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(int id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

    public int getNecesidad() {
        return necesidad;
    }

    public void setNecesidad(int necesidad) {
        this.necesidad = necesidad;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
