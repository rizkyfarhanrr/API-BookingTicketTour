-- phpMyAdmin SQL Dump
-- version 4.9.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 17, 2020 at 08:46 AM
-- Server version: 10.3.16-MariaDB
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
-- Database: `id12929892_db_wisataindonesia`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_destinasi`
--

CREATE TABLE `tbl_destinasi` (
  `kode_destinasi` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `namawisata_destinasi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `deskripsi_destinasi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `lokasi_destinasi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `ratting_destinasi` int(11) DEFAULT NULL,
  `hargatiket_destinasi` int(11) DEFAULT NULL,
  `gambar_destinasi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `kode_kota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_destinasi`
--

INSERT INTO `tbl_destinasi` (`kode_destinasi`, `namawisata_destinasi`, `deskripsi_destinasi`, `lokasi_destinasi`, `ratting_destinasi`, `hargatiket_destinasi`, `gambar_destinasi`, `kode_kota`) VALUES
('10110-01', 'Kota Tua', 'Kota Tua Jakarta, juga dikenal dengan sebutan Batavia Lama (Oud Batavia), adalah sebuah wilayah kecil di Jakarta, Indonesia. Wilayah khusus ini memiliki luas 1,3 kilometer persegi melintasi Jakarta Utara dan Jakarta Barat (Pinangsia, Taman Sari dan Roa Malaka). Dijuluki \"Permata Asia\" dan \"Ratu dari Timur\" pada abad ke-16 oleh pelayar Eropa, Jakarta Lama dianggap sebagai pusat perdagangan untuk benua Asia karena lokasinya yang strategis dan sumber daya melimpah.', 'Jakarta Pusat', 6, 17000, 'kotatua.jpg', 10110),
('10110-02', 'Taman Mini Indonesia Indah', 'Taman Mini Indonesia Indah adalah taman hiburan ikonik bertemakan Indonesia yang populer sejak tahun 90-an. Pengunjung bisa menikmati berbagai wahana dan fasilitas seperti misalnya Anjungan Daerah, kereta gantung, Teater 4D, museum, Teater IMAX Keong Mas, dan masih banyak lagi. Semua fasilitas, bangunan, wahana, dan dekorasi di tempat wisata di Jakarta ini merupakan miniatur dari 33 provinsi di Indonesia.', 'Jakarta Pusat', 6, 18000, 'tmii.jpg', 10110),
('10110-03', 'Pantai Ancol', 'Pantai Ancol adalah jalur pantai wisata yang terdiri dari lima pantai, yaitu Pantai Indah, Elok, Ria, Festival Ancol, dan Karnaval Ancol. Tempat wisata di Jakarta yang satu ini buka selama 24 jam dan menawarkan panorama indah, tempat makan, serta lokasi ideal untuk melihat matahari terbit atau terbenam. Pengunjung bisa berfoto, bermain pasir, jogging, atau makan di salah satu restoran yang ada di kawasan wisata terpadu ini. Berbagai titik di tempat wisata di Jakarta yang satu ini juga cocok untuk meramaikan album Instagram Anda.', 'Jakarta Utara', 4, 25000, 'ancol.jpg', 10110),
('10110-04', 'Ocean Dream Samudra', 'Ocean Dream Samudra, atau dikenal juga dengan nama Gelanggang Samudra, adalah tempat wisata di Jakarta yang bertemakan laut dan berada di kawasan Taman Impian Jaya Ancol. Gelanggang Samudra menawarkan atraksi hewan-hewan seperti lumba-lumba dan singa laut, Taman Surga Burung, pertunjukan menegangkan seperti Scorpion Rides, hingga wahana bermain seperti Ubur-Ubur dan Boto-Boto.\r\n', 'Jakarta Barat', 4, 15000, 'samudra.jpg', 10110),
('10110-05', 'Dunia Fantasi', 'Dunia Fantasi adalah taman hiburan keluarga di area Taman Impian Jaya Ancol. Taman ini menawarkan beragam wahana, mulai dari yang menegangkan seperti Tornado, Halilintar dan Hysteria, hingga yang cocok untuk semua umur seperti Rumah Miring, Poci-Poci, Turangga Rangga, dan Pontang-Pontang.\r\n', 'Jakarta Timur', 3, 17000, 'dufan.jpg', 10110),
('10110-06', 'Allianz Ecopark', 'Allianz Ecopark, atau dikenal juga dengan nama Ocean Ecopark, adalah taman wisata alam dan keluarga di kawasan Taman Impian Jaya Ancol. Taman ini dikelilingi pepohonan rindang dan sungai yang asri. Selain itu, terdapat jalur untuk berolahraga, taman bermain, danau wisata, kebun binatang mini, gazebo untuk santai, serta kano dan perahu kayuh.', 'Jakarta Pusat', 3, 10000, 'alianz.jpg', 10110),
('17111-01', 'Go! Wet Waterpark – Grand Wisata', 'Jam Buka: Senin – Jum’at/Hari kerja (10.30 – 18.30) & Sabtu, Minggu/Hari libur Nasional (09.00 – 20.00)\nTelepon: (021) 29560000, HTM: Senin – Jum’at/Hari kerja (Anak – anak Rp. 100.000,- & Dewasa Rp. 175.000,-) & Sabtu, Minggu/Hari libur Nasional (Anak – anak Rp. 150.000,- & Dewasa Rp. 225.000,-)', 'Tambun Selatan, Bekasi', 4, 100000, 'grandwisata.jpg', 17111),
('17111-02', 'Curug Parigi', 'Jam Buka: 24 Jam, HTM: Rp. 2.000,-/Orang', 'Bantargebang, Bekasi City', 3, 10000, 'parigi.jpg', 17111),
('17111-03', 'Columbus Waterpark', 'Jam Buka: Setiap hari (08.00 – 18.00)\r\nTelepon: (021) 29081234\r\nHTM: Senin – jum’at/Hari kerja (Anak – anak Rp. 30.000,- & Dewasa Rp. 40.000,-) & Sabtu, Minggu/Hari libur Nasional (Anak – anak Rp. 60.000,- & Dewasa Rp. 65.000,-)', 'Mustikajaya, Kota Bekasi', 5, 100000, 'columbus-waterpark.jpg', 17111),
('17111-04', 'Snow World International Revo Town', 'Jam Buka: Setiap hari (11.00 – 20.30)\r\nTelepon: 0813-3357-7722\r\nHTM: Mulai usia 1 th dengan tinggi hingga 140 cm Rp 50. 000\r\nTinggi tubuh 140 cm keatas Rp 60. 000', 'Bekasi Selatan, Kota Bekasi', 6, 100000, 'snow-word-bekasi.jpg', 17111),
('17111-05', 'Galaxy Tirtamas Club', 'Jam Buka: Setiap hari (07.00 – 20.00)\r\nTelepon: (021) 82415372\r\nHTM: Senin – Jum’at (Rp. 18.000,-) & Sabtu, Minggu (Rp. 23.000,-)', 'Bekasi Selatan, Kota Bekasi', 4, 50000, 'tirtamas.jpg', 17111),
('17111-06', 'Venetian Water Carnaval', 'Jam Buka: Setiap hari (08.00 – 18.00)\r\nTelepon: (021) 88377272\r\nHTM: Rp. 35.000,-\r\n\r\nAlamat: Perumah', 'Tambun Utara, Bekasi', 5, 50000, 'water-carnaval.jpg', 17111),
('25111-01', 'Banto Rayo', 'Papan titian yang mengesankan, Pernah membayangkan berjalan di atas jembatan papan untuk mengelilingi perairan dan hutan bakau dengan nuansa yang asri dan natural? Well, kamu bisa langsung mencobanya di Taman Wisata Banto Rayo Koto Tangah, Tilatang Kamang Agam, yang merupakan salah satu destinasi wisata di Padang yang relatif baru!', 'Banto Royo, Padang', 5, 50000, 'bantoroyo.jpg', 25111),
('25111-02', 'Masjid Tuo Kayu Jao', 'Bukti sejarah kejayaan Islam, Wisata rohani di Padang? Bisa banget! Masjid Tuo Kayu Jao merupakan masjid tertua di Minangkabau, yang usianya sudah mencapai lebih dari 400 tahun. Bentuknya yang unik dan lokasinya yang eksotik menjadikan masjid ini menjadi destinasi wisata di Padang yang layak untuk dikunjungi.', 'Alahan Panjang, Padang.', 5, 10000, 'Masjid Tuo.jpg', 25111),
('25111-03', 'Goa Batu Kapal', 'Gugusan stalaktit dan stalakmit nyentrik , Berada di wilayah perkebunan sawit terbesar di Solok Selatan, Goa Batu Kapal menjadi salah satu destinasi wisata ngehits di Sumatera Barat. Hiasan stalagtit dan stalagmit di dinding goa yang begitu mengesankan menjadi daya tarik yang tidak bisa dilewatkan!', 'Solok Selatan, Padang', 3, 10000, 'Goa Batu.jpg', 25111),
('25111-04', 'Danau Biru', 'Siapa sangka bekas galian tambang batu bara bisa menjelma menjadi destinasi wisata di Padang dan sekitarnya yang seru dan menawan. Danau Biru di Sawahlunto adalah salah satu di antaranya, di mana danau buatan ini menampung air dengan warna biru yang indah. Dengan panorama keren di sekitarnya, lokasi ini dijamin sangat instagenik deh.', 'Sawahlunto, Padang', 5, 15000, 'Danau Biru.jpg', 25111),
('25111-05', 'Masjid Raya Sumatera Barat', 'Salah satu landmark terbaru yang dimiliki Padang dan Sumatera, Masjid Raya Sumatera Barat ini memiliki bentuk yang mengadopsi rumah adat Minangkabau. Karena keunikannya ini, spot tersebut turut menjadi destinasi wisata religi bagi yang berkunjung ke ibukota Sumatera Barat ini.', 'Padang, Sumatra Barat', 5, 50000, 'Masjid Raya Sumatera Barat.jpg', 25111),
('25111-06', 'Lawang Adventure Park', 'Salah satu spot asyik untuk menikmati Danau Maninjau adalah di Lawang Park, Agam. Tidak hanya memiliki spot yang asyik dari ketinggian, kamu juga bisa menemukan banyak wahana bermain untuk mendapatkan liburan singkat yang menyenangkan di Agam', 'Agam, Padang', 3, 35000, 'Lawang Adventure Park.jpg', 25111),
('40191-01', 'Kebun Teh Sukawana', 'Wisata alam Bandung beragam sekali, mulai dari yang ramai sampai dengan tempat yang masih sepi pengunjung. Nah, bagi anda yang ingin ngadem di kebun teh di Lembang, kebun teh Sukawana bisa jadi alternatif nih. Tempatnya memang sedikit tersembunyi sehingga rada jarang yang datang kesini.\r\n\r\nPadahal, tempatnya cukup bagus lho. Kebun tehnya rapi dan hijau. Juga tidak bising. Tempatnya juga tidak begitu jauh dari Curug cimahi ataupun Dusun bambu.', 'Lembang, Bandung', 5, 15000, 'Kebun Teh Sukawana.jpg', 40191),
('40191-02', 'Pinisi Resto', 'Glamping Lakeside di Rancabali – Ciwidey bisa dikatakan salah satu tujuan utama wisata di Bandung selatan saat ini. Dengan icon restoran berbentuk perahu yang besar yang ada di pinggir situ Patenggang, suasana disekitarnya indah sekali. Destinasi wisata Bandung Selatan yang satu ini termasuk lengkap. Mulai dari fasilitas yang tersedia, pemandangan alam yang indah, tempat bermain anak, tempat makan dan minum, sampai dengan menginap di Glamping.', 'Ciwidey, Bandung', 5, 25000, 'Pinisi Resto.jpg', 40191),
('40191-03', 'Curug Cinulang', 'Curug Cinulang terletak di perbatasan kabupaten Bandung dengan Sumedang. Tapi tempatnya lebih mudah dijangkau dari Bandung, tepatnya dari Cicalengka. Lokasinya berada di pinggir jalan dan lumayan asyik buat liburan. Bagi anda yang kebetulan', 'Cicalengka, Bandung', 5, 35000, 'Curug Cinulang.jpg', 40191),
('40191-04', 'Curug Tilu Leuwi Opat', 'Mau trekking ringan di Lembang? anda bisa berkunjung ke curug tilu leuwi opat. tempatnya berada di area Parongpong lembang, tidak jauh dari dusun bambu dan curug cimahi. Untuk menuju ke lokasi, anda harus berjalan menyusuri trek yang tersedia kurang lebih 30 menit. Tapi, banyak banget spot bagusnya lho. Suasananya juga hijau dan adem banget.', 'Lembang, Bandung', 6, 50000, 'Curug Tilu Leuwi Opat.jpg', 40191),
('40191-05', 'Gunung Tangkuban Perahu', 'Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.', 'Lembang, Bandung', 5, 100000, 'Gunung Tangkuban Perahu.jpg', 40191),
('40191-06', 'Kawah Putih', 'Nama Kawah Putih Ciwidey sudah tidak asing di kalangan pecinta alam. Kawah yang terletak di daerah Ciwidey sekitar 50 Km di selatan Bandung ini merupakan kawah vulkanik dengan tanah yang berwarna putih akibat kandungan belerang pada tanahnya tersebut. Airnya yang berwarna cerah dan terkadang berubah warna merupakan keunikan dari kawah itu sendiri.', 'Ciwidey, Bandung', 5, 25000, 'Kawah Putih.jpg', 40191),
('55111-01', 'Tugu Jogja', 'Jl. Jenderal Sudirman, Gowongan, Jetis, Kota Yogyakarta.', 'Jetis, Kota Yogyakarta', 5, 50000, 'Tugu Jogja.jpg', 55111),
('55111-02', 'Alun-alun Kidul', 'Jalan Alun-alun Kidul, Patehan, Kraton, Yogyakarta.', 'Kraton, Yogyakarta.', 3, 25000, 'Alun-alun Kidul.jpg', 55111),
('55111-03', 'Titik Nol Kilometer', 'Jl. Margo Mulyo No. 9, Ngupasan, Gondomanan, Kota Yogyakarta.', 'Gondomanan, Kota Yogyakarta.', 5, 15000, 'Titik Nol Kilometer.jpg', 55111),
('55111-04', 'Keraton Yogyakarta', 'Jl. Rotowijayan Blok 1, Panembahan, Keraton, Kota Yogyakarta.', 'Keraton, Kota Yogyakarta.', 4, 25000, 'Keraton Yogyakarta.jpg', 55111),
('55111-05', 'Jalan Malioboro', 'Jl. Margo Mulyo, Ngupasan, Gondomanan, Kota Yogyakarta, DIY.', 'Gondomanan, Kota Yogyakarta, DIY.', 5, 30000, 'Jalan Malioboro.jpg', 55111),
('55111-06', 'Museum Batik Yogyakarta', 'Jl. Dr. Sutomo, Yogyakarta.', 'Yogyakarta', 5, 25000, 'Museum Batik Yogyakarta.jpg', 55111),
('60111-01', 'Atlantis Land Kenjeran', 'Lokasi pertama ada di Atlantis Land Kenjeran. Tempat ini adalah salah satu wahana wisata air yang mantap untuk dikunjungi. Diresmikan tahun 2017, wahana ini terinspirasi dari Universal Studio Singapura. Disana kita bisa menikmati beberapa wahana, diantaranya berbagai kolam renang dan seluncuran air, museum Atlantis Land, dan masih banyak lagi. Fasilitasnya juga sangat lengkap. Lokasi: Jalan Sukolilo Larangan No.100, Kenjeran, Park, Kota SBY, Jawa Timur 60124, Jam buka: Setiap hari 10.00-20.00, Tiket masuk: Tinggi di bawah 85 cm Rp 100.000 dan Tinggi di atas 85 cm Rp 125.000', 'Kenjeran, Park, Kota Surabaya', 5, 350000, 'Atlantis Land Kenjeran.jpg', 60111),
('60111-02', 'Pantai Kenjeran', 'Tak suka tempat wisata surabaya Atlantis Land Kenjeran, mungkin bisa coba Pantai Kenjeran. Pantai Kenjeran di daerah Timur Surabaya adalah salah satu destinasi wisata yang cukup sering dikunjungi. Walaupun memang ada beberapa bagian pantai yang mulai kotor, sehingga dibutuhkan kesadaran yang tinggi dari wisatawan untuk menjaga kebersihan Pantai Kenjeran. Jadi kalau kamu kesana, mohon jangan ikut memperparah ya.', 'Kenjeran, Kota Surabaya', 5, 125000, 'Pantai Kenjeran.jpg', 60111),
('60111-03', 'Ciputra Waterpark', 'Mau wisata lebaran sekaligus memanfaatkan momen berkunjung ke wahana air terbesar di Indonesia bahkan Asia Tenggara? Datanglah ke Ciputra Waterpark! Ciputra Waterpark menawarkan banyak wahana mengasyikkan seperti Chimera Pool, Sirens River, Marina Lagoon, dan Sinbad Playground. Selain ukuran lokasinya yang sangat besar dan wahana air yang beragam, arsitektur khas dongeng 1001 malam menambah keunikan Waterpark ini. Per 2018, Ciputra Waterpark beroperasi dari hari Selasa hingga Minggu. Untuk weekend, Ciputra Waterpark buka pukul 10.00-19.00 WIB, sedangkan pada hari Selasa hingga Jumat akan buka pada pukul 13.00-19.00 WIB. Pada weekend, harga tiket naik dari 110.000 rupiah menjadi 130.000 rupiah. Lokasi: Kawasan Waterpark Boulevard Citraland, Made, Kec. Sambikerep, Kota SBY, Jawa Timur 60219', 'Sambikerep, Kota Surabaya', 4, 38000, 'Ciputra Waterpark.jpg', 60111),
('60111-04', 'Hutan Mangrove', 'Hutan mangrove ini adalah salah satu wahana alam Surabaya yang menjadi tempat terbaik untuk mengasingkan diri dari keramaian dunia. Selain itu, keindahan alam yang ditawarkan lokasi ini juga menjanjikan, sehingga dapat menjadi spot wisata selfie dan Instagram. Ada beberapa titian kayu yang dapat dilewati untuk menyusuri hutan bakau ini. Selain mendapat kesegaran, menikmati kendahan alam dan menghilangkan stress, wisata ini juga dapat menjadi sarana edukasi hutan mangrove bagi keluarga. Tiket masuknya Rp. 25.000,- per orang. Lokasi: Jl. Monorejo Timur No 1, Surabaya', 'Wonorejo, Surabaya', 6, 50000, 'Hutan Mangrove.jpg', 60111),
('60111-05', 'Museum Kapal Selam', 'KRI Pasoepati 410, kapal selam republik Indonesia yang berjasa dalam operasi pembebasan Irian Barat lalu menjadi wahana wisata sejajah di surabaya. KRI adalah kapal buatan Uni Soviet tahun 1952 yang kini bisa kita nikmati di Jalan Pemuda no. 39. Monumen kapal selam ini hanya ada 2 di dunia. Hal yang menarik dari kapal selam ini adalah periskop asli yang dapat dioperasikan dan terdapat pemutaran film. Tempat yang buka tiap hari pukul 08.00-22.00 WIB ini membutuhkan Rp. 10.000 sekali masuk, termasuk tiket film serta foto sepuasnya. Lokasi: Jl. Pemuda No.39, Embong Kaliasin, Kec. Genteng, Kota SBY, Jawa Timur 60277', 'Genteng, Kota Surabaya', 5, 45000, 'Museum Kapal Selam.jpg', 60111),
('60111-06', 'Surabaya North Quay', 'Terletak dekat Pelabuhan Tanjung Perak, Surabaya North Quay adalah tempat wisata surabaya yang cocok untuk merenung memandangi keindahan lautan dan pelabuhan secara gratis, kecuali jika ingin berkeliling Selat Madura dengan menaiki kapal. Cukup 75.000 saja, kita sudah bisa menikmati pemandangan Selat Madura. Tempat ini dapat dikunjungi siang hari dan pukul 9 pagi di hari Minggu. Lokasi: Perak Utara, Kota Surabaya', 'Perak Utara, Kota Surabaya', 4, 200000, 'Surabaya North Quay,jpg', 60111);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kota`
--

CREATE TABLE `tbl_kota` (
  `kode_kota` int(11) NOT NULL,
  `nama_kota` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `ratting_kota` int(11) DEFAULT NULL,
  `gambar_kota` text COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_kota`
--

INSERT INTO `tbl_kota` (`kode_kota`, `nama_kota`, `ratting_kota`, `gambar_kota`) VALUES
(10110, 'Kota Jakarta', 3, 'jakarta.jpg'),
(17111, 'Kota Bekasi', 4, 'bekasi.jpg'),
(25111, 'Kota Padang', 5, 'padang.jpg'),
(40191, 'Kota Bandung', 6, 'bandung.jpg'),
(55111, 'Kota Yogyakarta', 5, 'jogja.jpg'),
(60111, 'Kota Surabaya', 5, 'surabaya.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `kode_user` int(11) NOT NULL,
  `namalengkap_user` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `jeniskelamin_user` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username_user` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_user` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `email_user` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `picture` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_craeted` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`kode_user`, `namalengkap_user`, `jeniskelamin_user`, `username_user`, `password_user`, `email_user`, `picture`, `user_craeted`) VALUES
(11233, 'Bayu Sulaksono', 'Laki-laki', 'bayu', 'bayu', 'bayu.sulaksono@gmail.com', 'bayu.jgp', '2020-03-12 03:34:19'),
(12389, 'Jenifer Andriyani', 'Perempuan', 'jenifer22', 'jenifer22', 'jenifer.id@gmail.com', 'jenifer.png', '2020-03-16 15:35:17'),
(18342, 'Afriansyah Saputra', 'Laki-laki', 'afriansyah', 'afriansyah', 'afri.saputra@gmail.com', 'afri.jgp', '2020-03-12 03:34:19'),
(21398, 'Hilda Syafitri', 'Perempuan', 'hilda', 'hilda123', 'hilda.123@gmail.com', 'hilda.jgp', '2020-03-12 03:34:19'),
(34242, 'Winda Ayuningtias', 'Perempuan', 'winda', 'windaid', 'winda.id@gmail.com', 'winda.jgp', '2020-03-12 03:34:19'),
(35434, 'Reno Ferdiansyah', 'Laki-laki', 'reno', 'ferdi', 'reno.ferdi@gmail.com', 'reno.jpg', '2020-03-13 01:07:41'),
(37408, 'Rudi Kumala', 'Laki-laki', 'rudi', 'rudi2123', 'rudi.kumala@gmail.com', 'rudi.jpg', '2020-03-13 02:41:02'),
(37441, 'Linda Amalia', 'Perempuan', 'linda', 'amalia', 'linda.amalial@gmail.com', 'linda.jpg', '2020-03-13 02:38:36'),
(37443, 'Lina Maulida', 'Perempuan', 'lina', 'maulida', 'maulida.lina@gmail.com', 'lina.jpg', '2020-03-13 02:34:44'),
(44453, 'Nuri Kumalasari', 'Perempuan', 'nuri123', 'nuri123', 'nuri.kumalasari@gmail.com', 'nuri.jpg', '2020-03-12 03:35:22'),
(74394, 'Fikri Fadhilah', 'Laki-laki', 'fikri', 'fikri123', 'fikri.fadhilah@gmail.com', 'fikri.jpg', '2020-03-16 23:13:08'),
(82342, 'Rida Citra Fitriani', 'Perempuan', 'citra', 'citraid', 'citra.fitriani@gmail.com', 'rida.jgp', '2020-03-12 03:34:19'),
(93421, 'Lukman Hidayat', 'Laki-laki', 'lookman', 'lookman123', 'lookman.id@gmail.com', 'lukman.jgp', '2020-03-12 03:34:19');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_destinasi`
--
ALTER TABLE `tbl_destinasi`
  ADD PRIMARY KEY (`kode_destinasi`),
  ADD KEY `FK_dest2kota` (`kode_kota`);

--
-- Indexes for table `tbl_kota`
--
ALTER TABLE `tbl_kota`
  ADD PRIMARY KEY (`kode_kota`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`kode_user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_destinasi`
--
ALTER TABLE `tbl_destinasi`
  ADD CONSTRAINT `FK_dest2kota` FOREIGN KEY (`kode_kota`) REFERENCES `tbl_kota` (`kode_kota`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
