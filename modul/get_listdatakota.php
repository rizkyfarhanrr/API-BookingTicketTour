<?php
    include '../config/connection.php';

    if($_SERVER['REQUEST_METHOD'] == 'GET') {
        $queryListKota = "SELECT * FROM tbl_kota";
        $executeListKota = mysqli_query($_AUTH, $queryListKota);

        $_response = array();

        while ($row = mysqli_fetch_array($executeListKota)) {
            array_push($_response, array(
                'kode_kota' => $row[0],
                'nama_kota' => $row[1],
                'ratting_kota' => $row[2],
                'gambar_kota' => $row[3]));
        }
        echo json_encode(array(
            "message" => "Data kota TERSEDIA di database.",
            "code" => 200,
            "status" => true,
            "result" => $_response));
        mysqli_close($_AUTH);
    } else {
        echo json_encode(array(
            "message" => "Forbidden, This request ISN'T this METHOD and must be FILL PARAMETER.", 
            "code" => 400, 
            "status" => false)
        );
    }

?>