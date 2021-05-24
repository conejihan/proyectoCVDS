package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.sampleprj.dao.UsuarioDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.UsuarioMapper;

public class MyBatisUsuarioDAO implements UsuarioDAO{

    //@Inject
    UsuarioMapper usuarioMapper;

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioMapper.registrarUsuario(usuario);
    }

    @Override
    public Usuario consultarUsuarioPorID(int id_usuario) {
        return usuarioMapper.consultarUsuarioPorID(id_usuario);
    }

    @Override
    public Usuario consultarUsuarioPorCorreoOUsuario(String correo) {
        return usuarioMapper.consultarUsuarioPorCorreoOUsuario(correo);
    }
}
