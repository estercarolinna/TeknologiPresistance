-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 07, 2015 at 07:57 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_administrasisekolah`
--
CREATE DATABASE IF NOT EXISTS `db_administrasisekolah` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `db_administrasisekolah`;

-- --------------------------------------------------------

--
-- Table structure for table `tb_daftartagian`
--

CREATE TABLE IF NOT EXISTS `tb_daftartagian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kode` varchar(255) NOT NULL,
  `tagihan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kode` (`kode`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tb_daftartagian`
--

INSERT INTO `tb_daftartagian` (`id`, `kode`, `tagihan`) VALUES
(1, 'TGH1', 'SPP'),
(2, 'TGH2', 'Uang Buku'),
(3, 'TGH3', 'Layanan Osis'),
(4, 'TGH4', 'Iuran UKS');

-- --------------------------------------------------------

--
-- Table structure for table `tb_siswa`
--

CREATE TABLE IF NOT EXISTS `tb_siswa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nis` varchar(255) NOT NULL,
  `tanggallahir` date DEFAULT NULL,
  `tingkatan_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nis` (`nis`),
  KEY `FKFACD6F56BB3144D5` (`tingkatan_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `tb_siswa`
--

INSERT INTO `tb_siswa` (`id`, `alamat`, `nama`, `nis`, `tanggallahir`, `tingkatan_id`) VALUES
(5, 'Jetis, Salatiga', 'Eido Yonatan', '112013001', '1997-09-26', 15),
(6, 'Salatiga', 'Paulus', '112014002', '1997-09-20', 16),
(7, 'Bali', 'Andre Hartono', '112013003', '1997-04-03', 17),
(8, 'Salatiga', 'Bagas ', '112012004', '1997-08-20', 16),
(9, 'sragen', 'Ester Carolina', '112013005', '1998-08-23', 15),
(10, 'Blora', 'Hanny ', '2016', '1998-09-30', 16);

-- --------------------------------------------------------

--
-- Table structure for table `tb_tingkatan`
--

CREATE TABLE IF NOT EXISTS `tb_tingkatan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kode` varchar(255) NOT NULL,
  `tingkatan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kode` (`kode`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `tb_tingkatan`
--

INSERT INTO `tb_tingkatan` (`id`, `kode`, `tingkatan`) VALUES
(15, '3', 'Tingkat 3'),
(16, '2', 'Tingkat 2'),
(17, '1', 'Tingkat 1');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE IF NOT EXISTS `tb_transaksi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `harga` varchar(255) DEFAULT NULL,
  `kode` varchar(255) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `daftarTagian_id` bigint(20) DEFAULT NULL,
  `siswa_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kode` (`kode`),
  KEY `FK62086E1714DCA0BF` (`daftarTagian_id`),
  KEY `FK62086E174FB7A615` (`siswa_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id`, `harga`, `kode`, `tanggal`, `daftarTagian_id`, `siswa_id`) VALUES
(2, '500.000', 'T12', '2015-07-30', 1, 5),
(3, '100.000', 'T13', '2015-07-30', 2, 6),
(5, '150.000', 'T11', '2015-07-30', 3, 7),
(6, '50.000', 'T14', '2015-07-30', 4, 8),
(7, '500.000', 'T15', '2015-07-30', 1, 9),
(8, '300.000', 'T17', '2015-07-30', 3, 10);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_siswa`
--
ALTER TABLE `tb_siswa`
  ADD CONSTRAINT `FKFACD6F56BB3144D5` FOREIGN KEY (`tingkatan_id`) REFERENCES `tb_tingkatan` (`id`);

--
-- Constraints for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `FK62086E1714DCA0BF` FOREIGN KEY (`daftarTagian_id`) REFERENCES `tb_daftartagian` (`id`),
  ADD CONSTRAINT `FK62086E174FB7A615` FOREIGN KEY (`siswa_id`) REFERENCES `tb_siswa` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
