DROP TABLE IF EXISTS `fabricante`;
DROP TABLE IF EXISTS `articulo`;

CREATE TABLE `fabricante`(
`codigo` INT auto_increment,
`nombre` varchar(100),
PRIMARY KEY (`codigo`)
);


CREATE TABLE `articulo`(
`codigo` INT auto_increment,
`nombre` varchar(100),
`precio` INT,
`codigo_fabricante` INT,
PRIMARY KEY (`codigo`),
CONSTRAINT `fabricante_fk` FOREIGN KEY (`codigo_fabricante`) 
REFERENCES `fabricante` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE);

INSERT INTO `fabricante` (`codigo`, `nombre`) VALUES (default,'Sony'),(default,'Creative Labs'),(default,'Hewlett-Packard'),(default,'Iomega'),(default,'Fujitsu'),(default,'Winchester');

INSERT INTO `articulo`  VALUES (default,'Hard drive',240,5),(default,'Memory',120,6),(default,'ZIP drive',150,4),(default,'Floppy disk',5,6),(default,'Monitor',240,1),(default,'DVD drive',180,2),(default,'CD drive',90,2),(default,'Printer',270,3),(default,'Toner cartridge',66,3),(default,'DVD burner',180,2);