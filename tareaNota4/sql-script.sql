# Script para crear tabla productos

create table producto(
idProducto varchar(10) not null,
nombre varchar(25) not null,
marca varchar(25),
modelo varchar(25),
precio int,
fechaVencimiento date,
PRIMARY KEY (idProducto)
);
