package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {

    void registrarUsuario(@Param("usuario") Usuario usuario);
    Usuario consultarUsuarioPorID(@Param("ID")int id_usuario);
    Usuario consultarUsuarioPorCorreoOUsuario (@Param("correo") String correo);
}
