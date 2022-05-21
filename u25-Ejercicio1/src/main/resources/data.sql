DROP TABLE IF EXISTS fabricante;
DROP table IF EXISTS articulo;

create table fabricante(
id int auto_increment,
nombre varchar(100),
primary key(id)
);

create table articulo(
id int auto_increment,
nombre varchar(100),
precio int,
id_fabricante int,
primary key(id),
foreign key(id_fabricante) references fabricante(id)
on delete restrict on update cascade
);

INSERT INTO fabricante VALUES ('Sony'),('Creative Labs'),('Hewlett-Packard'),('Iomega'),('Fujitsu'),('Winchester');

INSERT INTO articulo VALUES ('Hard drive',240,5),('Memory',120,6),('ZIP drive',150,4),('Floppy disk',5,6),('Monitor',240,1),('DVD drive',180,2),('CD drive',90,2),('Printer',270,3),('Toner cartridge',66,3),('DVD burner',180,2);
