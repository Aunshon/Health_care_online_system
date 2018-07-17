-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2017 at 05:09 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_health`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_allapointment`
--

CREATE TABLE `tbl_allapointment` (
  `D_id` int(255) NOT NULL,
  `D_username` varchar(255) NOT NULL,
  `D_department` varchar(255) NOT NULL,
  `D_day` varchar(255) NOT NULL,
  `D_time` varchar(255) NOT NULL,
  `D_date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_allapointment`
--

INSERT INTO `tbl_allapointment` (`D_id`, `D_username`, `D_department`, `D_day`, `D_time`, `D_date`) VALUES
(1, 'aun', 'heart', 'monday', '8', '11');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_dotor`
--

CREATE TABLE `tbl_dotor` (
  `D_id` int(255) NOT NULL,
  `D_username` varchar(255) NOT NULL,
  `D_password` varchar(255) NOT NULL,
  `D_department` varchar(25) NOT NULL,
  `D_email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_dotor`
--

INSERT INTO `tbl_dotor` (`D_id`, `D_username`, `D_password`, `D_department`, `D_email`) VALUES
(1, 'aun', 'aun', 'heart', 'aun@'),
(10, 'hasan', 'hasan', 'eye', 'hasan@'),
(11, 'qq', 'aun', 'qq', 'qq');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_message`
--

CREATE TABLE `tbl_message` (
  `m_id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `message` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_message`
--

INSERT INTO `tbl_message` (`m_id`, `email`, `message`) VALUES
(3, 'aaaaaa', 'aaaaaa'),
(4, 'aunshon@hotmail.com', 'give me my password');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `P_id` int(255) NOT NULL,
  `P_username` varchar(255) NOT NULL,
  `P_password` varchar(255) NOT NULL,
  `P_email` varchar(255) NOT NULL,
  `P_color` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`P_id`, `P_username`, `P_password`, `P_email`, `P_color`) VALUES
(2, 'aun', 'aun', 'aunshon@hotmail.com', 'red'),
(3, 'rr', 'rr', 'rr', 'rr'),
(4, 'patient1', 'aaaa', 'pat@', 'red'),
(5, 'vv', 'vvv', 'vv', 'vv');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_stuff`
--

CREATE TABLE `tbl_stuff` (
  `S_id` int(255) NOT NULL,
  `S_username` varchar(255) NOT NULL,
  `S_password` varchar(255) NOT NULL,
  `S_email` varchar(255) NOT NULL,
  `S_color` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_stuff`
--

INSERT INTO `tbl_stuff` (`S_id`, `S_username`, `S_password`, `S_email`, `S_color`) VALUES
(1, 'ss', 'lalu', 'ss', 'ss'),
(2, 'lalu', 'lalu', 'lalu@', 'blue');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_dotor`
--
ALTER TABLE `tbl_dotor`
  ADD PRIMARY KEY (`D_id`);

--
-- Indexes for table `tbl_message`
--
ALTER TABLE `tbl_message`
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`P_id`);

--
-- Indexes for table `tbl_stuff`
--
ALTER TABLE `tbl_stuff`
  ADD PRIMARY KEY (`S_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_dotor`
--
ALTER TABLE `tbl_dotor`
  MODIFY `D_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tbl_message`
--
ALTER TABLE `tbl_message`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `P_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_stuff`
--
ALTER TABLE `tbl_stuff`
  MODIFY `S_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
