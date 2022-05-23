DROP TABLE IF EXISTS `articulo`;
DROP TABLE IF EXISTS `fabricante`;


CREATE TABLE `fabricante`(
`codigo` int auto_increment PRIMARY KEY,
`nombre` varchar(100)
);

INSERT INTO `fabricante` (`codigo`, `nombre`) VALUES (default,'Sony'),(default,'Creative Labs'),(default,'Hewlett-Packard'),(default,'Iomega'),(default,'Fujitsu'),(default,'Winchester');

CREATE TABLE `articulo`(
`codigo` int auto_increment PRIMARY KEY,
`nombre` varchar(100),
`precio` int,
`codigo_fabricante` int,
CONSTRAINT `fabricante_fk` FOREIGN KEY (`codigo_fabricante`) REFERENCES `fabricante` (codigo)
);

INSERT INTO `articulo` (`codigo`, `nombre`, `precio`, `codigo_fabricante`) VALUES (default,'Hard drive',240,5),(default,'Memory',120,6),(default,'ZIP drive',150,4),(default,'Floppy disk',5,6),(default,'Monitor',240,1),(default,'DVD drive',180,2),(default,'CD drive',90,2),(default,'Printer',270,3),(default,'Toner cartridge',66,3),(default,'DVD burner',180,2);
