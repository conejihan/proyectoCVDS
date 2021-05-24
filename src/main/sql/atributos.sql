------------
-- CHECKS --
------------

-- USUARIOS
ALTER TABLE Usuarios
	ADD  CONSTRAINT CK_rol_Usuarios
	CHECK(
    	rol IN ('Administrador', 'Estudiante', 'Profesor', 'Egresado', 'Administrativo')
    );

-- CATEGORIAS
ALTER TABLE Categorias
	ADD CONSTRAINT CK_fechas_Categorias
	CHECK (
		(fecha_modificacion > fecha_creacion) OR (fecha_modificacion = NULL)
	);

-- NECESIDADES
ALTER TABLE Necesidades
	ADD CONSTRAINT CK_fechas_Necesidades
	CHECK (
		(fecha_modificacion > fecha_creacion) OR (fecha_modificacion = NULL)
	);

ALTER TABLE Necesidades
	ADD CONSTRAINT CK_estado_Necesidades
	CHECK (
		estado IN ('Activa', 'En proceso', 'Resuelta', 'Cerrada')
	);

-- OFERTAS
ALTER TABLE Ofertas
	ADD CONSTRAINT CK_fechas_Ofertas
	CHECK (
		(fecha_modificacion > fecha_creacion) OR (fecha_modificacion = NULL)
	);

ALTER TABLE Ofertas
	ADD CONSTRAINT CK_estado_Ofertas
	CHECK (
		estado IN ('Activa', 'En proceso', 'Resuelta', 'Cerrada')
	);

-- RESPUESTA
ALTER TABLE Respuestas
	ADD CONSTRAINT CK_Oferta_O_Necesidad_Respuesta
	CHECK (
		((oferta = NULL) AND (necesidad <> NULL)) OR
		((necesidad = NULL) AND (oferta <> NULL))
	);