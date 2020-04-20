<?php
    include '../config/connection.php';

    if($_SERVER['REQUEST_METHOD'] == 'POST') {

        if (trim($_POST['usernamein']) == "") {
            echo json_encode(array(
                "message" => "Check fill this parameter, you must be fill.",
                "code" => 400,
                "status" => false));
        } else {
            $usernamein_get = $_POST['usernamein'];

            $queryGetAccountIn = "SELECT * FROM tbl_user WHERE username_user = '$usernamein_get'";
            $executeGetAccountIn = mysqli_query($_AUTH, $queryGetAccountIn);

            $_response = array();
            
            while ($row = mysqli_fetch_array($executeGetAccountIn)) {
                array_push($_response, array(
                    'kode_user' => $row[0],
                    'namalengkap_user' => $row[1],
                    'jeniskelamin_user' => $row[2],
                    'username_user' => $row[3],
                    'email_user' => $row[5],
                    'picture' => $row[6]
                    )
                );
                echo json_encode(array(
                    "message" => "Data dengan account username $usernamein_get TERSEDIA di database.",
                    "code" => 200,
                    "status" => true,
                    "result" => $_response));
                mysqli_close($_AUTH);
            }
        }
    }
?>