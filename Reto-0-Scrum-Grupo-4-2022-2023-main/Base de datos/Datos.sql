USE `reto0-scrum-grupo4`;
insert into calefaccion values(1,0),(2,0),(3,1),(4,0),(5,0),(6,1),(7,0),(8,0),(9,1),(10,0),(11,0),(12,1),(13,0),(14,0),(15,1),(16,0),(17,0),(18,1),(19,0),(20,0),(21,1),(22,0),(23,0);
insert into alarma_de_incendios values(1,0),(2,0),(3,1),(4,0),(5,0),(6,1),(7,0),(8,0),(9,1),(10,0),(11,0),(12,1),(13,0),(14,0),(15,1),(16,0),(17,0),(18,1),(19,0),(20,0),(21,1),(22,0),(23,0);
insert into usuario values(1,"admin","a","Profesor","admin@admin.com","a");
create user admindam identified by 'elorrieta';
grant all privileges on *.* to admindam with grant option; 
