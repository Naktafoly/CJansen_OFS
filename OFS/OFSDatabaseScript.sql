-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 25, 2015 at 10:47 PM
-- Server version: 5.6.13
-- PHP Version: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ofs`
--
CREATE DATABASE IF NOT EXISTS `ofs` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ofs`;

-- --------------------------------------------------------

--
-- Table structure for table `addressbook`
--

CREATE TABLE IF NOT EXISTS `addressbook` (
  `NaamId` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` varchar(30) NOT NULL,
  `Adres` varchar(30) NOT NULL,
  `Telefoon` int(11) NOT NULL,
  `E-mail` varchar(50) NOT NULL,
  PRIMARY KEY (`NaamId`),
  UNIQUE KEY `Naam` (`NaamId`,`Naam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `appointments`
--

CREATE TABLE IF NOT EXISTS `appointments` (
  `AfspraakId` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` int(11) NOT NULL,
  `Datum` date NOT NULL,
  `Note` text NOT NULL,
  PRIMARY KEY (`AfspraakId`),
  KEY `Naam` (`Naam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `invoices`
--

CREATE TABLE IF NOT EXISTS `invoices` (
  `FactuurId` int(11) NOT NULL AUTO_INCREMENT,
  `Naam` int(11) NOT NULL,
  `Ontvangen` date NOT NULL,
  `Vervaldatum` date NOT NULL,
  `Betaald` tinyint(1) NOT NULL,
  `Prijs` double NOT NULL,
  `Formulier` blob NOT NULL,
  PRIMARY KEY (`FactuurId`),
  KEY `Naam_2` (`Naam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointments`
--
ALTER TABLE `appointments`
  ADD CONSTRAINT `appointments_ibfk_1` FOREIGN KEY (`Naam`) REFERENCES `addressbook` (`NaamId`);

--
-- Constraints for table `invoices`
--
ALTER TABLE `invoices`
  ADD CONSTRAINT `invoices_ibfk_1` FOREIGN KEY (`Naam`) REFERENCES `addressbook` (`NaamId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
