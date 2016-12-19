create table empleado(
rut varchar(10),
nombre varchar(50),
apellido varchar(50),
fecha_nacimiento varchar(10),
n_cargas int,
primary key(rut)
)

insert into empleado (rut, nombre, apellido, fecha_nacimiento, n_cargas)
values ('13951445-9', 'Cata', 'Orellana', '1980-07-08', 2);

insert into empleado (rut, nombre, apellido, fecha_nacimiento, n_cargas)
values ('1-9', 'Pepito', 'De los Andes', '1986-05-08', 3);

insert into empleado (rut, nombre, apellido, fecha_nacimiento, n_cargas)
values ('15315720-0', 'Juanito', 'De los Rios', '1991-01-08', 3);