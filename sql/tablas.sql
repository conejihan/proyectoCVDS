CREATE TABLE Usuarios(
    id_usuario SERIAL NOT NULL,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    correo VARCHAR(50) NOT NULL,
    telefono VARCHAR(10),
    estado VARCHAR(20) NOT NULL,
    usuario VARCHAR(15) NOT NULL,
    contrasenia VARCHAR(10) NOT NULL,
    rol VARCHAR(20) NOT NULL
);

CREATE TABLE Categorias(
    id_categoria SERIAL NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    usuario INT NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL,
    fecha_modificacion TIMESTAMP
);

CREATE TABLE Necesidades(
    id_necesidad SERIAL NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    urgencia VARCHAR(20) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    categoria INT NOT NULL,
    usuario INT NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL,
    fecha_modificacion TIMESTAMP
);

CREATE TABLE Ofertas(
    id_oferta SERIAL NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    categoria INT NOT NULL,
    usuario INT NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL,
    fecha_modificacion TIMESTAMP
);

CREATE TABLE Respuestas(
    id_respuesta SERIAL NOT NULL,
    titulo VARCHAR(30) NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    usuario INT NOT NULL,
    oferta INT,
    necesidad INT
);

CREATE TABLE Comentarios(
    id_comentario SERIAL NOT NULL,
    comentario VARCHAR(100) NOT NULL,
    respuesta INT NOT NULL,
    usuario INT NOT NULL
);