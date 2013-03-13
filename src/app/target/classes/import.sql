SELECT pg_catalog.setval('hibernate_sequence', 5000, true);

INSERT INTO estado (id, nombre) VALUES (1, 'Dtto. Capital');
INSERT INTO estado (id, nombre) VALUES (2, 'Amazonas');
INSERT INTO estado (id, nombre) VALUES (3, 'Anzoategui');
INSERT INTO estado (id, nombre) VALUES (4, 'Apure');
INSERT INTO estado (id, nombre) VALUES (5, 'Aragua');
INSERT INTO estado (id, nombre) VALUES (6, 'Barinas');
INSERT INTO estado (id, nombre) VALUES (7, 'Bolivar');
INSERT INTO estado (id, nombre) VALUES (8, 'Carabobo');
INSERT INTO estado (id, nombre) VALUES (9, 'Cojedes');
INSERT INTO estado (id, nombre) VALUES (10, 'Delta Amacuro');
INSERT INTO estado (id, nombre) VALUES (11, 'Falcon');
INSERT INTO estado (id, nombre) VALUES (12, 'Guarico');
INSERT INTO estado (id, nombre) VALUES (13, 'Lara');
INSERT INTO estado (id, nombre) VALUES (14, 'Merida');
INSERT INTO estado (id, nombre) VALUES (15, 'Miranda');
INSERT INTO estado (id, nombre) VALUES (16, 'Monagas');
INSERT INTO estado (id, nombre) VALUES (17, 'Nueva Esparta');
INSERT INTO estado (id, nombre) VALUES (18, 'Portuguesa');
INSERT INTO estado (id, nombre) VALUES (19, 'Sucre');
INSERT INTO estado (id, nombre) VALUES (20, 'Tachira');
INSERT INTO estado (id, nombre) VALUES (21, 'Trujillo');
INSERT INTO estado (id, nombre) VALUES (22, 'Vargas');
INSERT INTO estado (id, nombre) VALUES (23, 'Yaracuy');
INSERT INTO estado (id, nombre) VALUES (24, 'Zulia');
INSERT INTO estado (id, nombre) VALUES (25, 'Dep. Federales');

INSERT INTO tipo_alojamiento (id,nombre) VALUES (1,'Hotel');
INSERT INTO tipo_alojamiento (id,nombre) VALUES (2,'Posada');
INSERT INTO tipo_alojamiento (id,nombre) VALUES (3,'Campamento');

INSERT INTO comodidad_general (id,nombre) VALUES (1, 'Estacionamiento privado');
INSERT INTO comodidad_general (id,nombre) VALUES (2, 'Piscina');
INSERT INTO comodidad_general (id,nombre) VALUES (3, 'Aire Acondicionado');

INSERT INTO ubicacion (id,nombre,estado) VALUES (1,'Los Roques', 25);
INSERT INTO ubicacion (id,nombre,estado) VALUES (2,'Canaima', 7);

INSERT INTO tipo_ci_rif (id, nombre) VALUES (1,'V-');
INSERT INTO tipo_ci_rif (id, nombre) VALUES (2,'E-');
INSERT INTO tipo_ci_rif (id, nombre) VALUES (3,'J-');
INSERT INTO tipo_ci_rif (id, nombre) VALUES (4,'P-');
INSERT INTO tipo_ci_rif (id, nombre) VALUES (5,'G-');


INSERT INTO tipo_habitacion (id, nombre) VALUES (1, 'Sencilla');
INSERT INTO tipo_habitacion (id, nombre) VALUES (2, 'Doble');

INSERT INTO servicios_incluidos (id, nombre) VALUES (1, 'Desayuno');
INSERT INTO servicios_incluidos (id, nombre) VALUES (2, 'Cena');

INSERT INTO comodidades (id, nombre) VALUES (1, 'Aire acondicionado');
INSERT INTO comodidades (id, nombre) VALUES (2, 'Caja de seguridad');


INSERT INTO tipo_tarifa (id, nombre) VALUES (1, 'Precio por persona por noche');
INSERT INTO tipo_tarifa (id, nombre) VALUES (2, 'Precio por habitacion por noche');
INSERT INTO tipo_tarifa (id, nombre) VALUES (3, 'Paquete completo');

INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (1, 'publicacion.diasMinimos','2','Minimo de dias de vigencia que debe tener una publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (2, 'publicacion.diasMaximos','180','Maximo de dias de vigencia que debe tener una publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (3, 'publicacion.porcentajeComisionDefault','15','Porcentaje de comision por defecto');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (4, 'publicacion.numeroHabitacionesMax','999','Numero maximo de habitaciones por publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (5, 'publicacion.numeroHabitacionesMin','1','Numero minimo de habitaciones por publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (6, 'publicacion.numeroNochesMinMin','1','Numero minimo de noches minimas por reservacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (7, 'publicacion.numeroNochesMinMax','60','Numero maximo de noches minimas por reservacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (8, 'publicacion.numeroNochesMaxMin','1','Numero minimo de noches maximas por reservacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (9, 'publicacion.numeroNochesMaxMax','60','Numero maximo de noches maximas por reservacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (10, 'publicacion.cantidadPersonasMin','1','Numero minimo de personas para el campo');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (11, 'publicacion.cantidadPersonasMax','100','Numero maximo de personas para el campo');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (12, 'publicacion.porcentajeComisionVariablePlataformaPago','9','Porcentaje que cobra la plataforma de pago por cada transaccion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (13, 'publicacion.montoComisionFijaPlataformaPago','2.5','Comision fija que cobra la plataforma de pago por cada transaccion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (14, 'publicacion.montoComisionFijaPorTransferenciaBancaria','2.5','Comision fija por transferencia bancaria al hospedaje');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (15, 'publicacion.porcentajeComisionMinimoAquedarseSobreTarifa','6','Porcentaje minimo de comision sobre la tarifa de la publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (16, 'publicacion.porcentajeComisionMaximoAquedarseSobreTarifa','12','Porcentaje maximo de comision sobre la tarifa de la publicacion');
INSERT INTO configuracion (id, clave, valor, descripcion) VALUES (17, 'publicacion.porcentajeComisionFijoAquedarseSobreTarifa','10','Porcentaje fijo de comision sobre la tarifa de la publicacion');

INSERT INTO pais (id, version, nombre, region) VALUES (1, 0,'Venezuela', 'es-VE');

INSERT INTO moneda (id,version, separador_decimales, separador_miles, simbolo, pais) VALUES (1, 0, ',' , '.' , 'BsF' , 1);


INSERT INTO BANCO (ID, NOMBRE) VALUES (1, '100% BANCO, BANCO COMERCIAL C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (2, 'BANCAMIGA BANCO MICROFINANCIERO, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (3, 'BANCO ACTIVO, C.A BANCO COMERCIAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (4, 'BANCO AGRICOLA DE VENEZUELA, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (5, 'BANCO BICENTENARIO BANCO UNIVERSAL, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (6, 'BANCO CARONI, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (7, 'BANCO CENTRAL DE VENEZUELA');INSERT INTO BANCO (ID, NOMBRE) VALUES (8, 'BANCO CONFEDERADO, S.A. BANCO COMERCIAL REGIONAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (9, 'BANCO DE LA GENTE EMPRENDEDORA BANGENTE');
INSERT INTO BANCO (ID, NOMBRE) VALUES (10, 'BANCO DE VENEZUELA S.A.C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (11, 'BANCO DEL CARIBE, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (12, 'BANCO DEL PUEBLO SOBERANO, C.A. BANCO DE DESARROLLO');INSERT INTO BANCO (ID, NOMBRE) VALUES (13, 'BANCO DEL TESORO, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (14, 'BANCO ESPIRITO SANTO S.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (15, 'BANCO EXTERIOR, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (16, 'BANCO GUAYANA, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (17, 'BANCO INDUSTRIAL DE VENEZUELA, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (18, 'BANCO INTERNACIONAL DE DESARROLLO, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (19, 'BANCO MERCANTIL, C.A. S.A.C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (20, 'BANCO NACIONAL CREDITO, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (21, 'BANCO OCCIDENTAL DE DESCUENTO BANCO UNIVERSAL, C.A S.A.C.A');INSERT INTO BANCO (ID, NOMBRE) VALUES (22, 'BANCO PLAZA, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (23, 'BANCO PROVINCIAL, S.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (24, 'BANCO SOFITASA BANCO UNIVERSAL, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (25, 'BANCRECER S.A. BANCO DE DESARROLLO');INSERT INTO BANCO (ID, NOMBRE) VALUES (26, 'BANESCO BANCO UNIVERSAL S.A.C.A');INSERT INTO BANCO (ID, NOMBRE) VALUES (27, 'BANFOANDES, BANCO UNIVERSAL, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (28, 'BANORTE');INSERT INTO BANCO (ID, NOMBRE) VALUES (29, 'BANPLUS BANCO COMERCIAL, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (30, 'BFC BANCO FONDO COMUN C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (31, 'BOLIVAR BANCO, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (32, 'C.A., CENTRAL BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (33, 'CITIBANK N.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (34, 'CORP BANCA, C.A. BANCO UNIVERSAL');INSERT INTO BANCO (ID, NOMBRE) VALUES (35, 'DEL SUR BANCO UNIVERSAL, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (36, 'INSTITUTO MUNICIPAL DE CREDITO POPULAR');INSERT INTO BANCO (ID, NOMBRE) VALUES (37, 'MI BANCO, BANCO DE DESARROLLO, C.A.');INSERT INTO BANCO (ID, NOMBRE) VALUES (38, 'VENEZOLANO DE CREDITO, S.A. BANCO UNIVERSAL');
































