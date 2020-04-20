<?php
    include '../config/connection.php';

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $kodeuser = trim($_POST['kode_user']);
        $namalengkap = trim($_POST['namalengkap_user']);
        $jeniskelamin = trim($_POST['jeniskelamin_user']);
        $username = trim($_POST['username_user']);
        $password = trim($_POST['password_user']);
        $email = trim($_POST['email_user']);

        $_query_cekuser_exist = mysqli_query($_AUTH, "SELECT * FROM tbl_user WHERE username_user = '$username'");
        $_execute_cekuser_exist = mysqli_num_rows($_query_cekuser_exist);

        $_response = array();
        if ($_execute_cekuser_exist > 0) {
            $_response["message"] = trim("Username already exist! Try again.");
            $_response["code"] = 400;
            $_response["status"] = false;

            echo json_encode($_response);
        } else {
            $_query_insert_new_user = "INSERT INTO tbl_user (kode_user, namalengkap_user, jeniskelamin_user, username_user, password_user, email_user) VALUES ($kodeuser, '$namalengkap', '$jeniskelamin', '$username', '$password', '$email')";
            $_execute_register = mysqli_query($_AUTH, $_query_insert_new_user);

            $_query_cekuser_exist = mysqli_query($_AUTH, "SELECT * FROM tbl_user WHERE username_user = '$username'");

            if ($_execute_register > 0) {
                $_response["data_user"] = array();

                while ($row = mysqli_fetch_array($_query_cekuser_exist)) {
                    $data = array();

                    $data["kode_user"] = $row["kode_user"];
                    $data["namalengkap_user"] = $row["namalengkap_user"];
                    $data["jeniskelamin_user"] = $row["jeniskelamin_user"];
                    $data["username_user"] = $row["username_user"];
                    $data["password_user"] = $row["password_user"];
                    $data["email_user"] = $row["email_user"];
                    $data["user_craeted"] = $row["user_craeted"];

                    $_response["message"] = trim("You have been registered.");
                    $_response["code"] = 201;
                    $_response["status"] = true;

                    array_push($_response["data_user"], $data);
                }
                echo json_encode($_response);
            } else {
                $_response["message"] = trim("Failed to registered.");
                $_response["code"] = 400;
                $_response["status"] = false;

                echo json_encode($_response);
            }
        }
    } else {
        $_response["message"] = trim("Forbiedden.");
        $_response["code"] = 400;
        $_response["status"] = false;

        echo json_encode($_response);
    }
?>