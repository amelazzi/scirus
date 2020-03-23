-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3309
-- Généré le :  lun. 23 mars 2020 à 13:49
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `scirus`
--

-- --------------------------------------------------------

--
-- Structure de la table `humidity`
--

DROP TABLE IF EXISTS `humidity`;
CREATE TABLE IF NOT EXISTS `humidity` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `valeur` decimal(10,0) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `humidity`
--

INSERT INTO `humidity` (`Id`, `valeur`, `date`) VALUES
(1, '64', '2020-03-01 06:23:25'),
(2, '55', '2020-03-03 11:29:25'),
(3, '64', '2020-03-04 09:19:25'),
(4, '63', '2020-03-05 11:28:25'),
(5, '65', '2020-03-06 09:35:15'),
(6, '64', '2020-03-08 11:27:40'),
(7, '55', '2020-03-10 12:18:25'),
(8, '54', '2020-03-11 10:30:25'),
(9, '64', '2020-03-13 07:34:25'),
(10, '65', '2020-03-15 09:31:25'),
(11, '55', '2020-03-17 10:37:25'),
(12, '64', '2020-03-20 10:32:25');

-- --------------------------------------------------------

--
-- Structure de la table `luminosity`
--

DROP TABLE IF EXISTS `luminosity`;
CREATE TABLE IF NOT EXISTS `luminosity` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `valeur` float NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `luminosity`
--

INSERT INTO `luminosity` (`Id`, `valeur`, `date`) VALUES
(1, 2.6, '2020-03-05 10:11:02'),
(2, 3.9, '2020-03-08 12:11:02'),
(3, 3.8, '2020-03-10 12:11:02'),
(4, 2.5, '2020-03-11 03:11:02'),
(5, 8.2, '2020-03-12 14:11:02'),
(6, 2.4, '2020-03-14 13:11:02'),
(7, 2.3, '2020-03-15 15:11:02'),
(8, 2.4, '2020-03-01 10:11:02'),
(9, 2.2, '2020-03-18 10:11:02'),
(10, 2.4, '2020-03-19 09:11:02'),
(11, 2.3, '2020-03-02 07:32:02'),
(12, 2.5, '2020-03-21 05:34:28');

-- --------------------------------------------------------

--
-- Structure de la table `temperature`
--

DROP TABLE IF EXISTS `temperature`;
CREATE TABLE IF NOT EXISTS `temperature` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `valeur` float NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `temperature`
--

INSERT INTO `temperature` (`Id`, `valeur`, `date`) VALUES
(1, 9, '2020-01-02 00:00:00'),
(2, 12, '2020-03-21 00:00:00'),
(3, 3, '2020-03-21 08:39:40'),
(4, 9, '2020-03-21 18:08:50'),
(5, 11, '2020-03-21 11:09:01'),
(6, 7, '2020-03-21 10:36:34'),
(7, 8, '2020-03-16 13:56:34'),
(8, 5, '2020-03-12 22:56:34'),
(9, 10.2, '2020-03-20 11:56:34'),
(10, 12.9, '2020-03-19 08:56:34'),
(11, 13.6, '2020-03-11 14:26:34'),
(12, 11.5, '2020-03-19 06:56:34');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
