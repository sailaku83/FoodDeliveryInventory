 CREATE USER inventoryUser IDENTIFIED BY 'scalable';
 
create database IF NOT EXISTS inventorydb;
 
GRANT ALL PRIVILEGES ON inventorydb.* TO  'inventoryUser';
GRANT ALL PRIVILEGES ON inventorydb.* TO  'inventoryUser';