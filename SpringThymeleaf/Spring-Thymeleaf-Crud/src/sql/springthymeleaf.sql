-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 27, 2023 at 07:04 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springthymeleaf`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` char(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address1` text NOT NULL,
  `address2` text NOT NULL,
  `address3` text NOT NULL,
  `postal_code` char(10) NOT NULL,
  `note` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`id`, `name`, `phone`, `email`, `address1`, `address2`, `address3`, `postal_code`, `note`) VALUES
(1, 'Monkey D. Luffy', '09012345678', 'luffy@strawhatpirat.es', '', '', '', '', ''),
(2, 'Roronoa Zoro', '09023456789', 'zoro@strawhatpirat.es', '', '', '', '', ''),
(3, 'Nami', '09034567890', 'nami@strawhatpirat.es', '', '', '', '', ''),
(4, 'Usopp', '09045678901', 'usopp@strawhatpirat.es', '', '', '', '', ''),
(5, 'Vinsmoke Sanji', '09056789012', 'sanji@strawhatpirat.es', '', '', '', '', ''),
(6, 'Tony Tony Chopper', '09067890123', 'chopper@strawhatpirat.es', '', '', '', '', ''),
(7, 'Nico Robin', '09078901234', 'robin@strawhatpirat.es', '', '', '', '', ''),
(8, 'Franky', '09089012345', 'franky@strawhatpirat.es', '', '', '', '', ''),
(9, 'Brook', '09090123456', 'brook@strawhatpirat.es', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
