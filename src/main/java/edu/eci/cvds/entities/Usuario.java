package edu.eci.cvds.entities;

/**
 * @author Juan Camilo Gil
 * @author Leidy Marcela Ducuara
 * @author Nicolas Medina
 * @author Brayan Andres Macias
 * @author Juan Camilo Molina
 */
public class Usuario {
    private int id_usuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private Boolean estado;
    private String usuario;
    private String contraseña;
    private int rol;

    public Usuario(){}

    public Usuario(int id_usuario, String nombres, String apellidos, String correo, String telefono, Boolean estado, String usuario, String contraseña, int rol){
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}