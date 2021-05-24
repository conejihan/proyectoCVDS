------------
-- LLAVES --
------------

-- PRIMARY KEYS
ALTER TABLE Usuarios
	ADD CONSTRAINT PK_Usuarios
	PRIMARY KEY (id_usuario);

ALTER TABLE Categorias
	ADD CONSTRAINT PK_Categorias
	PRIMARY KEY (id_categoria);

ALTER TABLE Necesidades
	ADD CONSTRAINT PK_Necesidades
	PRIMARY KEY (id_necesidad);

ALTER TABLE Ofertas
	ADD CONSTRAINT PK_Ofertas
	PRIMARY KEY (id_oferta);

ALTER TABLE Respuestas
	ADD CONSTRAINT PK_Respuestas
	PRIMARY KEY (id_respuesta);

ALTER TABLE Comentarios
	ADD CONSTRAINT PK_Comentarios
	PRIMARY KEY (id_comentario);


-- UNIQUE KEYS
ALTER TABLE Usuarios
	ADD CONSTRAINT UK_Usuarios_usuario
	UNIQUE(usuario);

ALTER TABLE Usuarios
	ADD CONSTRAINT UK_Usuarios_correo
	UNIQUE(correo);

ALTER TABLE Categorias
	ADD CONSTRAINT UK_Categorias_nombre
	UNIQUE(nombre);


-- FOREIGN KEYS
ALTER TABLE Categorias
	ADD CONSTRAINT FK_Categorias_Usuarios
	FOREIGN KEY (usuario) REFERENCES Usuarios (id_usuario);

ALTER TABLE Necesidades
	ADD CONSTRAINT FK_Necesidades_Categorias
	FOREIGN KEY (categoria) REFERENCES Categorias (id_categoria);

ALTER TABLE Necesidades
    ADD CONSTRAINT FK_Necesidades_Usuarios
    FOREIGN KEY (usuario) REFERENCES Usuarios (id_usuario);

ALTER TABLE Ofertas
    ADD CONSTRAINT FK_Ofertas_Categorias
    FOREIGN KEY (categoria) REFERENCES Categorias (id_categoria);

ALTER TABLE Ofertas
    ADD CONSTRAINT FK_Ofertas_Usuarios
    FOREIGN KEY (usuario) REFERENCES Usuarios (id_usuario);

ALTER TABLE Respuestas
    ADD CONSTRAINT FK_Respuestas_Ofertas
    FOREIGN KEY (oferta) REFERENCES Ofertas (id_oferta);

ALTER TABLE Respuestas
    ADD CONSTRAINT FK_Respuestas_Necesidades
    FOREIGN KEY (necesidad) REFERENCES Necesidades (id_necesidad);

ALTER TABLE Respuestas
    ADD CONSTRAINT FK_Respuestas_Usuarios
    FOREIGN KEY (usuario) REFERENCES Usuarios (id_usuario);

ALTER TABLE Comentarios
    ADD CONSTRAINT FK_Comentarios_Respuestas
    FOREIGN KEY (respuesta) REFERENCES Respuestas (id_respuesta);

ALTER TABLE Comentarios
    ADD CONSTRAINT FK_Comentarios_Usuarios
    FOREIGN KEY (usuario) REFERENCES Usuarios (id_usuario);