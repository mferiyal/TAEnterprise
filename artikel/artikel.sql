-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2018 at 04:08 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_artikel`
--

-- --------------------------------------------------------

--
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `no` int(11) NOT NULL,
  `judul` varchar(500) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `text` varchar(500) NOT NULL,
  `foto` varchar(500) NOT NULL,
  `like` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artikel`
--

INSERT INTO `artikel` (`no`, `judul`, `tanggal`, `text`, `foto`, `like`) VALUES
(1, 'Speaker instan buat ponsel pintarmu', '07-12-2018', 'Nah lifehacks satu ini mengisyaratkan kalau jangan cuma ponsel aja yang pintar, penggunanya juga harus pintar. Speaker instan satu ini bisa jadi satu contohnya. Kalau kamu punya karton bekas tissue gulung seperti di gambar, jangan buru-buru dibuang. Tinggal sulap aja jadi speaker sekaligus holder ponsel kamu. Lifehacks ini lebih pas buat ponsel yang speaker-nya ada di bagian bawah. Daripada beli speaker mahal-mahal kan? ?', 'speaker.jpg', '2'),
(2, ' Punya celana sobek-sobek ternyata nggak cuma bisa buat pamer doang, ini contohnya!', '08-12-2018', 'Ini sih solusi untuk menjawab para manusia malas yang buat ambil atau naruh gelas di meja depannya aja mager ya. Tapi unik sih. Yang penting jangan mengeluh kalau kakinya jadi pegal-pegal karena nggak boleh bergerak biar minumnya nggak tumpah :p', 'celanasobek.jpg', '5'),
(3, 'Lilin di dalam gelas ini sering jadi permasalahan, lho waktu mau dinyalain. Ternyata solusinya begini..', '09-12-2018', 'Kalau kamu berpikir spageti cuma bisa dimakan doang, kamu salah! Karena ternyata bisa jadi sumbu untuk menyalakan api. Biasanya orang akan panik duluan kalau pas mati lampu nggak bisa menemukan korek. Selama di rumahmu ada persediaan spageti, bakar saja pakai kompor, terus baru deh bisa untuk menyalakan lilin. Kreatif kan?!', 'lilin.jpg', '6'),
(4, 'Gokil sih kalau ini nggak nanggung-nanggung totalitasnya ?', '10-12-2018', 'Kalau kamu benar-benar kehabisan ide untuk membakar daging dan kebetulan di rumah cuma ada troli, kamu bisa menerapkan cara di atas. Tapi selama ada cara lain yang kira-kira lebih ‘waras’ mungkin cara di atas bisa kamu lupakan hehe~', 'pemanggang.jpg', '7'),
(5, 'Wah baru tahu ternyata spoiler bisa jadi meja dadakan juga', '11-12-2018', 'Buat yang belum tahu fungsi spoiler di belakang mobil seperti di gambar, itu nggak cuma buat gaya-gayaan, lho Guys. Fungsi aslinya adalah untuk membantu mobil dalam aerodinamika atau menciptakan kestabilan pada mobil saat melaju di kecepatan tinggi. Biar mobil nggak melayang gitu intinya. Nah ternyata nggak cuma itu aja fungsi dari spoiler ini. Saat kamu lagi di perjalanan dan kebetulan ingin istirahat sejenak buat makan, spoiler bisa dijadikan meja seperti contoh di atas ?', 'spoiler.jpg', '7'),
(6, 'Cara cerdas buat para orang tua yang suka mengeluh kenapa anak-anaknya tumbuh terlalu cepat', '13-12-2018', 'Bukannya nggak senang anaknya bertambah besar, cuma masalahnya barang-barangnya jadi banyak yang nganggur dan nggak berfungsi. Salah satu contohnya seperti dipan berbentuk boks buat tempat tidur bayi itu. Kalau anak sudah besar jelas nggak lagi bisa digunakan. Eits, tapi jangan khawatir karena fungsinya bisa diubah jadi meja belajar!', 'mejabelajar.jpg', '4'),
(7, 'Jangan bersedih kalau di mobilmu nggak ada tempat khusus menaruh minuman. Cara ini bisa dicoba ?', '14-12-2018', 'Kadang kita suka sebal ketika beli minuman terutama yang pakai gelas begini, dan baru ingat kalau di mobil kita nggak ada tempat khusus menaruh minuman, pas sudah di dalam mobil! Selagi kamu punya selotip, kamu nggak perlu khawatir, karena di saat genting seperti itu, selotipmu akan sangat berguna. Hati-hati tumpah tapi ya!', 'minuman.jpg', '6'),
(8, 'Atau pakai cara ini. Tapi jangan protes kalau minumanmu malah ikutan bau :))', '15-12-2018', 'Hal yang perlu jadi pertimbangan pertama kali sebelum menerapkan lifehacks satu ini adalah: pastikan sepatumu nggak bau Guys! Ya meskipun kemungkinan terkontaminasinya kecil, tapi kan kalau bau sepatumu nempel di minumanmu bisa berabe juga ?', 'Minuman2.png', '8'),
(9, ' Raket multifungsi. Bisa jadi penyaring masa ?', '16-12-2018', 'Ngakak sih ini. Tapi ada beberapa pertanyaan yang mungkin bisa jadi pertimbangan sebelum kau menerapkan lifehacks ini. Pertama, namanya raket kan biasa buat bulutangkis ya, kalau tiba-tiba dialihkan jadi penyaring, apa nggak takut makanan terkontaminasi bakteri? Ya meskipun sudah dicuci tapi tetap aja kan. Nah, kedua, senar raketnya apa nggak meleleh atau rusak gitu ya kalau kena air panas atau minyak?', 'reket.jpg', '10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `artikel`
--
ALTER TABLE `artikel`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
