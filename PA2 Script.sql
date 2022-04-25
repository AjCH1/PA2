CREATE DATABASE IF NOT EXISTS pa2;

USE pa2;

CREATE TABLE IF NOT EXISTS Shoe(
   Name VARCHAR(255) NOT NULL UNIQUE,
   Price Double NOT NULL,
   Description LONGTEXT NOT NULL,
   Category VARCHAR(255) NOT NULL,
   Brand VARCHAR(255) NOT NULL,
   Image VARCHAR(255)NOT NULL,
   Rating Integer
);

REPLACE INTO Shoe(Name, Price, Description, Category, Brand, Image)
VALUES ('Nike Air Max 270', 160.00, 'Nike\'s first lifestyle Air Max brings you style, comfort and big attitude in the Nike Air Max 270. The design draws inspiration from Air Max icons, showcasing Nike\'s greatest innovation with its large window and fresh array of colors.', 'Black', 'Nike', "../images/shoe2.webp");

REPLACE INTO Shoe(Name, Price, Description, Category, Brand, Image)
VALUES ('Air Force 1', 100.00, 'The radiance lives on in the Nike Air Force 1, the b-ball OG that puts a fresh spin on what you know best: durably stitched overlays, clean finishes and the perfect amount of flash to make you shine.', 'White', 'Nike', "../images/shoe1.webp");

SELECT * FROM Shoe;

