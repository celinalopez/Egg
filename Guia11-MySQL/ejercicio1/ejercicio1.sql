insert into creador (nombre) values ("Marvel");
insert into creador (nombre) values ("DC Comics");

insert into personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
values ("Bruce Banner", "Hulk", 160, "600 mil", 75, 98, 1962, "Fisico nuclear", 1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Tony Stark", "Iron Man", 170, "200 mil", 70, 123, 1963, "Inventor industrial",1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Thor Odinson","Thor", 145, "Infinita", 100,235, 1962, "Rey de Asgard",1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ("Wanda Maximoff", "Bruja Escarlata", 170,"100 mil", 90, 345, 1964, "Bruja",1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ("Carol Danvers", "Capitana Marvel", 157, "250 mil",85, 128,1968, "Oficial de Inteligencia", 1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador)
VALUES ("Thanos", "Thanos", 170, "Infinita",40, 306,1973, "Adorador de la muerte", 1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Peter Parker", "Spiderman",65, "25 mil", 80,74, 1962,"Fotografo", 1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Steve Rogers", "Capitan America", 145, "600",45, 60, 1941,"Oficial Federal", 1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Bobby Drake", "Ice Man", 140, "2 mil",64, 122, 1963,"contador",1);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Barry Allen", "Flash", 160, "10 mil", 120, 168, 1956,"Cientifico Forense",2);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Bruce Wayne", "Batman", 170, "500", 32, 47, 1939,"Hombre de negocios", 2);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Clark Kent", "Superman", 165, "Infinita", 120, 182, 1948,"Reportero", 2);
INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ("Diana Prince", "Mujer Maravilla", 160, "Infinita", 95, 127, 1949, "Princesa Guerrera", 2);

select * from creador;
select * from personajes;

UPDATE personajes SET aparicion = 1938 WHERE personaje = "Superman";
select * from personajes;

delete from personajes where personaje = "Flash";
select * from personajes;

drop database superheroes; 

