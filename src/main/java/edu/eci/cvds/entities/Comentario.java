package edu.eci.cvds.entities;

/**
 * @author Juan Camilo Gil
 * @author Leidy Marcela Ducuara
 * @author Nicolas Medina
 * @author Brayan Andres Macias
 * @author Juan Camilo Molina
 */
public class Comentario {
    private int id_comentario;
    private String comentario;
    private int repuesta;
    private int usuario;

    public Comentario(){}

    public Comentario(int id_comentario, String comentario, int repuesta, int usuario){
        this.id_comentario = id_comentario;
        this.comentario = comentario;
        this.repuesta = repuesta;
        this.usuario = usuario;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRepuesta() {
        return repuesta;
    }

    public void setRepuesta(int repuesta) {
        this.repuesta = repuesta;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
