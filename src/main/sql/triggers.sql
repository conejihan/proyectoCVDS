---------------
--CATEGORIAS --
---------------

-- FECHAS DE CREACION Y MODIFICACION AUTOMATICAS
CREATE OR REPLACE FUNCTION F_AsignacionFechas_Categorias()
    RETURNS TRIGGER AS
    $$
    BEGIN
        IF (TG_ARGV[0] = 'Creacion') THEN
            NEW.fecha_creacion = CURRENT_TIMESTAMP;
        ELSIF (TG_ARGV[0] = 'Modificacion') THEN
            NEW.fecha_modificacion = CURRENT_TIMESTAMP;
        END IF;
        RETURN NEW;
    END;
    $$ LANGUAGE plpgsql;

CREATE TRIGGER TG_FechaCreacion_Categorias
    BEFORE INSERT ON Categorias FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Categorias('Creacion');

CREATE TRIGGER TG_FechaModificacion_Categorias
    BEFORE UPDATE ON Categorias FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Categorias('Modificacion');

-- LAS CATEGORÍAS SOLO LAS PUEDEN CREAR LOS USUARIOS CON ROL ADMINISTRADOR
CREATE OR REPLACE FUNCTION F_Usuario_Creador_Categoria()
    RETURNS TRIGGER AS
    $$
    DECLARE
        rolUsuarioCreador Usuarios.rol%type;
    BEGIN
        SELECT rol INTO rolUsuarioCreador
        FROM Usuarios
        WHERE Usuarios.id_usuario = NEW.Usuario;
        IF (rolUsuarioCreador <> 'Administrador') THEN
            RAISE EXCEPTION 'Solo los usuarios con rol de Administrador pueden crear Categorias';
        END IF;
        RETURN NEW;
    END;
    $$ LANGUAGE plpgsql;

CREATE TRIGGER TG_Usuario_Creador_Categoria
    BEFORE INSERT ON Categorias FOR EACH ROW
    EXECUTE PROCEDURE F_Usuario_Creador_Categoria();


----------------
--NECESIDADES --
----------------

-- FECHAS DE CREACION Y MODIFICACION AUTOMATICAS
CREATE OR REPLACE FUNCTION F_AsignacionFechas_Necesidades()
    RETURNS TRIGGER AS
    $$
    BEGIN
        IF (TG_ARGV[0] = 'Creacion') THEN
            NEW.fecha_creacion = CURRENT_TIMESTAMP;
        ELSIF (TG_ARGV[0] = 'Modificacion') THEN
            NEW.fecha_modificacion = CURRENT_TIMESTAMP;
        END IF;
        RETURN NEW;
    END;
    $$ LANGUAGE plpgsql;

CREATE TRIGGER TG_FechaCreacion_Necesidades
    BEFORE INSERT ON Necesidades FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Necesidades('Creacion');

CREATE TRIGGER TG_FechaModificacion_Necesidades
    BEFORE UPDATE ON Necesidades FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Necesidades('Modificacion');


-------------
-- OFERTAS --
-------------

-- FECHAS DE CREACION Y MODIFICACION AUTOMATICAS
CREATE OR REPLACE FUNCTION F_AsignacionFechas_Ofertas()
    RETURNS TRIGGER AS
    $$
    BEGIN
        IF (TG_ARGV[0] = 'Creacion') THEN
            NEW.fecha_creacion = CURRENT_TIMESTAMP;
        ELSIF (TG_ARGV[0] = 'Modificacion') THEN
            NEW.fecha_modificacion = CURRENT_TIMESTAMP;
        END IF;
        RETURN NEW;
    END;
    $$ LANGUAGE plpgsql;

CREATE TRIGGER TG_FechaCreacion_Ofertas
    BEFORE INSERT ON Ofertas FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Ofertas('Creacion');

CREATE TRIGGER TG_FechaModificacion_Ofertas
    BEFORE UPDATE ON Ofertas FOR EACH ROW
    EXECUTE PROCEDURE F_AsignacionFechas_Ofertas('Modificacion');