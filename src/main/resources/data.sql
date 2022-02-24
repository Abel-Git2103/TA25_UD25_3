DROP table IF EXISTS caja;
DROP table IF EXISTS almacen;

create table almacen(
	codigo int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    lugar nvarchar(100) DEFAULT NULL,
    capacidad int DEFAULT NULL
    );
    
create table caja(
    num_referencia char(5) NOT NULL PRIMARY KEY,
    contenido nvarchar(100) DEFAULT NULL,
    valor int DEFAULT NULL,
    almacen int DEFAULT NULL,
    FOREIGN KEY (almacen) REFERENCES almacen (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacen (lugar,capacidad) VALUES ('CALLE 10',10000);
insert into caja VALUES ('C0001','VARIOS','1000',1);
