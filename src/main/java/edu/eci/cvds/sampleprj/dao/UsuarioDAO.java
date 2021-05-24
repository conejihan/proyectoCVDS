package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
    
    void registrarUsuario(Usuario usuario);

    Usuario consultarUsuarioPorID(int id_usuario);

    Usuario consultarUsuarioPorCorreoOUsuario (String corre);
}
