<?php
    include '../config/connection.php';

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {

        if (trim($_POST['kodekota']) == "") {
            $_response["message"] = trim("Set Kode Kota for your Access the data.");
            $_response["code"] = 400;
            $_response["status"] = false;

            echo json_encode($_response);
        } else {
            $kodekota_get = trim($_POST['kodekota']);

            $queryListWisataFilter = "SELECT tbl_destinasi.kode_destinasi, tbl_destinasi.namawisata_destinasi, tbl_destinasi.deskripsi_destinasi, tbl_destinasi.lokasi_destinasi, tbl_destinasi.ratting_destinasi, tbl_destinasi.hargatiket_destinasi, tbl_destinasi.gambar_destinasi, tbl_kota.nama_kota, tbl_kota.ratting_kota, tbl_kota.gambar_kota, tbl_kota.kode_kota FROM tbl_destinasi JOIN tbl_kota ON tbl_destinasi.kode_kota = tbl_kota.kode_kota WHERE tbl_kota.kode_kota = '$kodekota_get' ORDER BY tbl_destinasi.kode_destinasi";
            $_response = array();
            $executeListWisataFilter = mysqli_query($_AUTH, $queryListWisataFilter);

            while ($row = mysqli_fetch_array($executeListWisataFilter)) {
                array_push($_response, array(
                    'kode_destinasi' => $row[0],
                    'namawisata_destinasi' => $row[1],
                    'deskripsi_destinasi' => $row[2],
                    'lokasi_destinasi' => $row[3],
                    'ratting_destinasi' => $row[4],
                    'hargatiket_destinasi' => $row[5],
                    'gambar_destinasi' => $row[6],
                    'nama_kota' => $row[7],
                    'ratting_kota' => $row[8],
                    'gambar_kota' => $row[9],
                    'kode_kota' => $row[10]
                    )
                );
            } 
            echo json_encode(array(
                "message" => "Data list tempat wisata TERSEDIA di database.",
                "code" => 200,
                "status" => true,
                "result" => $_response)
            );
        }
    } else {
        $_response["message"] = trim("Forbidden.");
        $_response["code"] = 403;
        $_response["status"] = false;
        echo json_encode($_response);
    }
?>