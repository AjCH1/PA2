SHOW DATABASES;                -- List the name of all the databases in this server

CREATE DATABASE IF NOT EXISTS pa2;

USE pa2;

CREATE TABLE IF NOT EXISTS Shoe(
   Name VARCHAR(255),
   Price Double,
   Description LONGTEXT,
   Rating Integer,
   Category VARCHAR(255),
   Creator VARCHAR(255)
);