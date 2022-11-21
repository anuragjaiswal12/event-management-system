-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 21, 2022 at 07:33 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `event_manager`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_event`
--

DROP TABLE IF EXISTS `tbl_event`;
CREATE TABLE IF NOT EXISTS `tbl_event` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(255) NOT NULL,
  `event_desc` varchar(255) NOT NULL,
  `event_releted` varchar(255) NOT NULL,
  `event_place` varchar(255) NOT NULL,
  `food_avl` varchar(20) NOT NULL,
  `event_fees` int(11) NOT NULL,
  `event_ttl_pass` int(11) NOT NULL,
  `event_avl_pass` int(11) NOT NULL,
  `event_date` date NOT NULL,
  `event_time` time NOT NULL,
  `last_reg_date` date NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `admin` varchar(255) NOT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_event`
--

INSERT INTO `tbl_event` (`event_id`, `event_name`, `event_desc`, `event_releted`, `event_place`, `food_avl`, `event_fees`, `event_ttl_pass`, `event_avl_pass`, `event_date`, `event_time`, `last_reg_date`, `status`, `admin`) VALUES
(1, 'Diwali Event', 'This Event is orgnized for diwali festival.', 'Diwali', 'VVN', 'No', 100, 100, 97, '2022-11-18', '04:00:00', '2022-11-10', 'updated', 'anurag@gmail.com'),
(2, 'Ram Navmi Mahotsav', 'This special event is orgnized for Ram navmi paavan parv.', 'Ram Navmi', 'Surat', 'Yes', 100, 500, 498, '2022-11-13', '04:15:00', '2022-11-08', 'cancelled', 'anurag@gmail.com'),
(3, 'Holi', 'This special event is orgnized for Holi.', 'Holi', 'Surat', 'Yes', 200, 100, 99, '2023-03-13', '05:15:00', '2023-03-08', 'cancelled', 'anurag@gmail.com'),
(4, 'November Party', 'This special event is orgnized for after diwali dance party.', 'Diwali', 'Althan', 'Yes', 100, 50, 50, '2022-11-10', '01:08:00', '2022-11-04', 'cancelled', 'error@gmail.com'),
(5, 'Freshers Party', 'This special event is orgnized for freshers after diwali.', 'Diwali', 'Adajan', 'Yes', 0, 50, 50, '2022-11-08', '23:17:00', '2022-11-06', 'cancelled', 'error@gmail.com'),
(6, 'Holi', 'This special event is orgnized for Holi.', 'Holi', 'Adajan', 'No', 500, 50, 50, '2022-11-15', '02:27:00', '2022-11-13', 'cancelled', 'aj@gmail.com'),
(7, 'Janmastmi', 'This is special janmastmi event.', 'Janmastmi', 'Bhatar', 'Yes', 500, 100, 100, '2023-08-19', '16:00:00', '2022-12-01', NULL, 'anurag@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_event_reg`
--

DROP TABLE IF EXISTS `tbl_event_reg`;
CREATE TABLE IF NOT EXISTS `tbl_event_reg` (
  `event_id` int(11) NOT NULL,
  `user_email` varchar(100) NOT NULL,
  KEY `fk_email` (`user_email`),
  KEY `fk_event` (`event_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_event_reg`
--

INSERT INTO `tbl_event_reg` (`event_id`, `user_email`) VALUES
(1, 'anurag@gmail.com'),
(2, 'anurag@gmail.com'),
(1, 'error@gmail.com'),
(3, 'anurag@gmail.com'),
(2, 'error@gmail.com'),
(1, 'aj@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE IF NOT EXISTS `tbl_user` (
  `user_email` varchar(100) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `user_pwd` varchar(30) NOT NULL,
  `user_img` varchar(255) NOT NULL DEFAULT 'default.png',
  PRIMARY KEY (`user_email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_email`, `user_name`, `user_pwd`, `user_img`) VALUES
('aj@gmail.com', 'Anurag Jaiswal', 'aj123', 'img7.png'),
('akash@gmail.com', 'Akash Behera', 'akash', 'default.png'),
('error@gmail.com', 'Error 404', 'error123', 'default.png'),
('mihir@gmail.com', 'Mihir Sakpal', 'mihir', 'img9.png'),
('anurag@gmail.com', 'Anurag', 'anurag', 'img4.png');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
