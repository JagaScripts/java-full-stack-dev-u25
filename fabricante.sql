create database tiendaInformaticaBD;

use tiendaInformaticaBD;

create table Fabricantes(
Id int auto_increment primary key,
Nombre varchar(100)
);

create table Articulos(
Id int auto_increment primary key,
Nombre varchar(100),
Precio int,
IdFabricante int,
Key(IdFabricante),
foreign key(IdFabricante) references Fabricantes(Id)
on delete restrict on update cascade
);
