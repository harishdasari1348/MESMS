-- phpMyAdmin SQL Dump
-- version 4.5.3.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 11, 2016 at 07:19 PM
-- Server version: 5.7.10
-- PHP Version: 5.6.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `messms`
--
CREATE DATABASE IF NOT EXISTS `messms` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `messms`;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `deptid` int(11) NOT NULL,
  `departmentname` varchar(200) NOT NULL,
  `departmentdescription` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `login_id` int(11) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `last_login` varchar(200) DEFAULT NULL,
  `ip` varchar(200) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`login_id`, `username`, `password`, `last_login`, `ip`) VALUES
(1, 'a', 'a', 'Feb 11, 2016 10:20:55 PM', '0:0:0:0:0:0:0:1');

-- --------------------------------------------------------

--
-- Table structure for table `staffdetails`
--

CREATE TABLE `staffdetails` (
  `biometricid` varchar(200) NOT NULL,
  `empname` varchar(200) NOT NULL,
  `doj` varchar(200) NOT NULL,
  `saltype` varchar(200) NOT NULL,
  `monsalary` varchar(200) NOT NULL,
  `department` varchar(200) NOT NULL,
  `bankaccnumber` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `modeoftravel` varchar(200) NOT NULL,
  `mobilenumber` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffdetails`
--

INSERT INTO `staffdetails` (`biometricid`, `empname`, `doj`, `saltype`, `monsalary`, `department`, `bankaccnumber`, `address`, `modeoftravel`, `mobilenumber`) VALUES
('a', 'a', '02/10/2016', 'Cash', 'a', 'CSE', '333', 'a', 'Car', '33333'),
('1', '2', '02/17/2016', 'Cash', '3a', 'CSE', '333', '3333', 'Bus', '33333'),
('3', '2', '3', 'Cash', '3', 'CSE', '333', '3333', 'Bus', '33333'),
('a1', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a2', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a3', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a4', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a5', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a6', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a7', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a8', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('a9', 'a', 'a', 'Cash', 'a', 'CSE', 'a', 'a', 'Bus', 'a'),
('123', 'a', '02/11/2016', 'Cash', 'a', 'CSE', '123', 'a', 'Bus', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`deptid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`login_id`);

--
-- Indexes for table `staffdetails`
--
ALTER TABLE `staffdetails`
  ADD PRIMARY KEY (`biometricid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `deptid` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `login_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
