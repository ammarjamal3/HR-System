-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2019 at 03:15 AM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ammarjamal`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(200) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `salary` double NOT NULL,
  `age` int(200) NOT NULL,
  `department` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `date_of_birth` varchar(200) NOT NULL,
  `gender` varchar(200) NOT NULL,
  `education` varchar(200) NOT NULL,
  `experience` varchar(200) NOT NULL,
  `contract_start` varchar(200) NOT NULL,
  `contract_end` varchar(200) NOT NULL,
  `nationality` varchar(200) NOT NULL,
  `mother_language` varchar(200) NOT NULL,
  `other_language` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `phone` double NOT NULL,
  `admin` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `fname`, `name`, `salary`, `age`, `department`, `address`, `date_of_birth`, `gender`, `education`, `experience`, `contract_start`, `contract_end`, `nationality`, `mother_language`, `other_language`, `email`, `phone`, `admin`) VALUES
(31, 'aqaaa', 'jamalhhh', 43, 65, 'sdfggf', 'fdg', 'Mon Jul 22 09:47:38 GMT+03:00 2019', 'male', 'kuygf', 'liuyg', 'Wed Jul 10 09:47:38 GMT+03:00 2019', 'Tue Jul 16 09:47:38 GMT+03:00 2019', 'iraqi', 'arabic', 'franch', 'hggj', 4355, ''),
(33, 'drt', 'd', 34, 43, 'gffgd', 'gfdfg', 'Wed Jul 10 10:01:48 GMT+03:00 2019', 'gdgfd', 'fgdf', 'fgd', 'Tue Jul 02 10:01:48 GMT+03:00 2019', 'Wed Jul 17 10:01:48 GMT+03:00 2019', 'fd', 'fg', 'fgfd', 'fgd', 7825050059, ''),
(34, 'dsf', 'dfs', 34, 34, 'sdf', 'fsd', 'Tue Jul 23 10:05:05 GMT+03:00 2019', 'fsd', 'dfs', 'dsf', 'Wed Jul 03 10:05:05 GMT+03:00 2019', 'Wed Jul 24 10:05:05 GMT+03:00 2019', 'sdf', 'fsd', 'dsf', 'dsf', 7825050059, ''),
(35, 'sdf', 'dsf', 32, 32, 'dsf', 'ds', 'Wed Jul 03 11:56:57 GMT+03:00 2019', 'ds', 'dssd', 'ds', 'Mon Jul 08 11:56:57 GMT+03:00 2019', 'Thu Jul 18 11:56:57 GMT+03:00 2019', 'ds', 'sd', 'dssd', 'sd', 324324, ''),
(36, 'kj', 'kj', 67, 23, 'gxf', 'gs', 'Wed Jul 03 23:26:05 GMT+03:00 2019', 'dfs', 'ds', 'ds', 'Thu Jul 04 23:26:05 GMT+03:00 2019', 'Mon Jul 15 23:26:05 GMT+03:00 2019', 'dsds', 'dsds', 'ds', 'dfsdf', 33232, ''),
(37, 'qw', 'qw', 12, 23, 'defg', 'kjho', 'Thu Jul 04 23:41:04 GMT+03:00 2019', 'loiu', 'hjk', 'yuiuil', 'Wed Jul 10 23:41:04 GMT+03:00 2019', 'Mon Jul 29 23:41:04 GMT+03:00 2019', 'dfff', 'dfsfd', 'afdg', 'adfg', 234567, ''),
(38, 'fgh', 'fghj', 45, 56, 'gh', 'gh', 'Wed Jul 03 23:52:27 GMT+03:00 2019', 'frghj', 'fgh', 'rgth', 'Wed Jul 03 23:52:27 GMT+03:00 2019', 'Mon Jul 15 23:52:27 GMT+03:00 2019', 'ghj', 'fvgh', 'gh', 'gh', 345678, ''),
(39, 'fg', 'fg', 56, 56, 'gh', 'gh', 'Thu Jul 18 00:10:57 GMT+03:00 2019', 'dfg', 'dfg', 'dfg', 'Wed Jul 10 00:10:57 GMT+03:00 2019', 'Thu Jul 11 00:10:57 GMT+03:00 2019', 'fg', 'fg', 'ggb', 'gh', 6543, ''),
(40, 'dfgD', 'rt', 45, 545, 'gh', 'fgh', 'Sat Jul 20 00:16:51 GMT+03:00 2019', 'fg', 'fg', 'fg', 'Fri Jul 12 00:16:51 GMT+03:00 2019', 'Fri Jul 12 00:16:51 GMT+03:00 2019', 'rt', 'fgf', 'gfh', 'fgh', 3456, ''),
(41, 'gh', 'gfg', 76, 67, 'hj', 'hj', 'Wed Jul 17 03:56:07 GMT+03:00 2019', 'hj', 'hj', 'hjjh', 'Tue Jul 02 03:56:07 GMT+03:00 2019', 'Tue Jul 30 03:56:07 GMT+03:00 2019', 'gh', 'jh', 'jh', 'hj', 566767, 'ammar'),
(42, 'asd', 'sad', 34, 34, 'sad', 'sda', 'Fri Jul 19 06:19:07 GMT+03:00 2019', 'fdg', 'df', 'fd', 'Wed Jul 03 06:19:07 GMT+03:00 2019', 'Tue Jul 30 06:19:07 GMT+03:00 2019', 'sad', 'sad', 'sad', 'sad', 324, 'ammar'),
(43, 'aaaaa', 'aaaa', 23, 23, 'aa', 'aa', 'Wed Jul 17 06:21:31 GMT+03:00 2019', 'sd', 'sd', 'ds', 'Tue Jul 02 06:21:31 GMT+03:00 2019', 'Wed Jul 31 06:21:31 GMT+03:00 2019', 'aa', 'aaa', 'aa', 'aa', 23, 'ammar'),
(45, 'qqq', 'qqq', 22, 22, 'qqq', 'qqq', 'Fri Jul 26 06:34:33 GMT+03:00 2019', 'qq', 'qqqq', 'qq', 'Fri Jul 05 06:34:33 GMT+03:00 2019', 'Tue Jul 16 06:34:33 GMT+03:00 2019', 'qqq', 'qqqq', 'qqq', 'qqq', 111, 'ammar'),
(46, 'www', 'www', 11, 11, 'ww', 'ww', 'Fri Jul 05 06:36:25 GMT+03:00 2019', 'www', 'ww', 'ww', 'Thu Jul 11 06:36:25 GMT+03:00 2019', 'Thu Jul 25 06:36:25 GMT+03:00 2019', 'ww', 'ww', 'ww', 'www', 11, 'ammar'),
(48, 'ggg', 'ggg', 33, 33, 'gg', 'gg', 'Thu Jul 04 06:40:10 GMT+03:00 2019', 'gg', 'gggg', 'gg', 'Thu Jul 04 06:40:11 GMT+03:00 2019', 'Thu Jul 11 06:40:11 GMT+03:00 2019', 'gg', 'ggg', 'gggg', 'gg', 33, 'ammar'),
(49, 'as', 'as', 21, 21, 'as', 'sa', 'Thu Jul 04 06:47:31 GMT+03:00 2019', 'sasa', 'sa', 'sa', 'Sat Jul 13 06:47:31 GMT+03:00 2019', 'Wed Jul 31 06:47:31 GMT+03:00 2019', 'sa', 'sa', 'sasa', 'sa', 12, 'ammar'),
(51, 'qw', 'qw', 21, 12, 'qw', 'qw', 'Thu Jul 18 06:50:42 GMT+03:00 2019', 'wq', 'qw', 'wq', 'Wed Jul 03 06:50:42 GMT+03:00 2019', 'Wed Jul 17 06:50:42 GMT+03:00 2019', 'wq', 'wq', 'qw', 'qw', 12, 'ammar'),
(52, 'hhh', 'hh', 66, 66, 'hhh', 'hh', 'Tue Jul 09 06:52:19 GMT+03:00 2019', 'hh', 'hhh', 'hhh', 'Wed Jul 03 06:52:20 GMT+03:00 2019', 'Thu Jul 18 06:52:20 GMT+03:00 2019', 'hh', 'h', 'hh', 'hh', 66, 'ammar'),
(53, 'qq', 'qq', 11, 11, 'qq', 'qq', 'Thu Jul 11 06:53:48 GMT+03:00 2019', 'qq', 'qqq', 'qq', 'Thu Jul 04 06:53:48 GMT+03:00 2019', 'Sat Jul 27 06:53:48 GMT+03:00 2019', 'qq', 'qqq', 'qq', 'qqq', 11, 'ammar'),
(54, 'ww', 'ww', 22, 22, 'ww', 'ww', 'Fri Jul 05 06:56:30 GMT+03:00 2019', 'ww', 'wwww', 'w', 'Thu Jul 04 06:56:30 GMT+03:00 2019', 'Thu Jul 18 06:56:30 GMT+03:00 2019', 'ww', 'www', 'ww', 'ww', 22, 'ammar'),
(55, 'q', 'q', 1, 1, 'q', 'q', 'Tue Jul 09 07:02:57 GMT+03:00 2019', 'q', 'q', 'q', 'Wed Jul 03 07:02:57 GMT+03:00 2019', 'Thu Jul 11 07:02:57 GMT+03:00 2019', 'q', 'q', 'q', 'qq', 1, 'ammar'),
(56, 'e', 'e', 3, 3, 'ee', 'e', 'Wed Jul 03 07:03:57 GMT+03:00 2019', 'e', 'e', 'e', 'Tue Jul 02 07:03:57 GMT+03:00 2019', 'Thu Jul 18 07:03:57 GMT+03:00 2019', 'e', 'e', 'ee', 'e', 3, 'ammar'),
(57, 't', 't', 5, 5, 'tt', 't', 'Thu Jul 04 07:05:13 GMT+03:00 2019', 't', 't', 't', 'Wed Jul 10 07:05:13 GMT+03:00 2019', 'Wed Jul 31 07:05:13 GMT+03:00 2019', 't', 't', 'tttt', 't', 5, 'ammar'),
(58, 'h', 'h', 5, 5, 'h', 'h', 'Wed Jul 03 07:08:30 GMT+03:00 2019', 'h', 'h', 'h', 'Wed Jul 03 07:08:30 GMT+03:00 2019', 'Fri Aug 09 07:08:30 GMT+03:00 2019', 'h', 'h', 'h', 'h', 5, 'ammar'),
(59, 'j', 'j', 7, 7, 'j', 'j', 'Wed Jul 17 07:10:23 GMT+03:00 2019', 'j', 'j', 'j', 'Wed Jul 03 07:10:23 GMT+03:00 2019', 'Wed Jul 24 07:10:23 GMT+03:00 2019', 'j', 'j', 'j', 'j', 7, 'ammar'),
(60, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 07:11:49 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 07:11:49 GMT+03:00 2019', 'Fri Aug 02 07:11:49 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar'),
(61, 'q', 'q', 1, 1, 'q', 'q', 'Wed Jul 03 07:14:02 GMT+03:00 2019', 'qq', 'q', 'q', 'Thu Jul 04 07:14:02 GMT+03:00 2019', 'Thu Jul 18 07:14:02 GMT+03:00 2019', 'q', 'q', 'q', 'q', 1, 'ammar'),
(62, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 07:21:09 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 07:21:09 GMT+03:00 2019', 'Wed Jul 24 07:21:09 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar'),
(63, 'q', 'q', 1, 1, 'q', 'q', 'Wed Jul 10 07:34:34 GMT+03:00 2019', 'qq', 'q', 'q', 'Wed Jul 03 07:34:34 GMT+03:00 2019', 'Thu Jul 11 07:34:34 GMT+03:00 2019', 'q', 'q', 'q', 'q', 1, 'ammar'),
(64, 'w', 'w', 2, 2, 'ww', 'w', 'Tue Jul 16 07:36:38 GMT+03:00 2019', 'w', 'w', 'w', 'Tue Jul 02 07:36:39 GMT+03:00 2019', 'Fri Jul 26 07:36:39 GMT+03:00 2019', 'w', 'w', 'w', 'w', 2, 'ammar'),
(65, 'y', 'y', 6, 6, 'y', 'y', 'Wed Jul 10 07:41:50 GMT+03:00 2019', 'y', 'y', 'y', 'Wed Jul 03 07:41:50 GMT+03:00 2019', 'Wed Jul 17 07:41:50 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar'),
(66, 't', 't', 5, 5, 't', 't', 'Thu Jul 04 07:42:46 GMT+03:00 2019', 't', 't', 't', 'Tue Jul 02 07:42:46 GMT+03:00 2019', 'Thu Jul 18 07:42:46 GMT+03:00 2019', 't', 't', 't', 't', 5, 'ammar'),
(67, 'y', 'y', 6, 6, 'y', 'y', 'Wed Jul 03 07:44:56 GMT+03:00 2019', 'y', 'y', 'y', 'Wed Jul 03 07:44:56 GMT+03:00 2019', 'Tue Jul 16 07:44:56 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar'),
(68, 'y', 'y', 6, 6, 'y', 'y', 'Tue Jul 02 07:48:07 GMT+03:00 2019', 'y', 'y', 'y', 'Tue Jul 02 07:48:07 GMT+03:00 2019', 'Fri Jul 12 07:48:07 GMT+03:00 2019', 'y', 'y', 'yyy', 'y', 6, 'ammar'),
(69, 'y', 'y', 6, 6, 'y', 'y', 'Tue Jul 09 07:49:10 GMT+03:00 2019', 'y', 'y', 'y', 'Tue Jul 09 07:49:10 GMT+03:00 2019', 'Thu Jul 11 07:49:10 GMT+03:00 2019', 'y', 'y', 'y', 'y', 6, 'ammar'),
(70, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'Thu Jul 18 13:59:57 GMT+03:00 2019', 'w', 'ww', 'ww', 'w', 2, 'ammar'),
(71, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'w', 'w', 'w', 'Wed Jul 03 13:59:57 GMT+03:00 2019', 'Thu Jul 18 13:59:57 GMT+03:00 2019', 'w', 'ww', 'ww', 'w', 2, 'ammar'),
(72, 'e', 'e', 3, 3, 'e', 'e', 'Wed Jul 17 14:09:48 GMT+03:00 2019', 'e', 'e', 'e', 'Wed Jul 03 14:09:48 GMT+03:00 2019', 'Tue Jul 30 14:09:48 GMT+03:00 2019', 'e', 'ee', 'e', 'e', 3, 'ammar'),
(73, 'w', 'w', 2, 2, 'w', 'w', 'Wed Jul 24 09:00:24 GMT+03:00 2019', 'w', 'w', 'w', 'Thu Jul 04 09:00:24 GMT+03:00 2019', 'Thu Jul 11 09:00:24 GMT+03:00 2019', 'w', 'w', 'ww', 'w', 2, 'ammar'),
(74, 'w', 'w', 2, 2, 'w', 'w', 'Tue Jul 16 09:01:08 GMT+03:00 2019', 'w', 'w', 'w', 'Thu Jul 11 09:01:08 GMT+03:00 2019', 'Wed Jul 10 09:01:08 GMT+03:00 2019', 'e', 'e', 'e', 'e', 3, 'abbas'),
(75, 'd', 'd', 3, 3, 'ed', 'd', 'Wed Jul 10 09:03:20 GMT+03:00 2019', 'ddd', 'd', 'dd', 'Thu Jul 04 09:03:20 GMT+03:00 2019', 'Fri Aug 02 09:03:20 GMT+03:00 2019', 'd', 'd', 'ddd', 'd', 3, 'ammar');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'ammar', 'jamal'),
(2, 'abbas', 'saeed');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
