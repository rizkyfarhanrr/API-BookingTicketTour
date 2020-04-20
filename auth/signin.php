<?php
    include '../config/connection.php';

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {

        if (trim($_POST['username']) == "") {
            $_response["message"] = trim("Fill your username in here.");
            $_response["code"] = 400;
            $_response["status"] = false;

            echo json_encode($_response);
        } else if (trim($_POST['password']) == "") {
            $_response["message"] = trim("Fill your password in here.");
            $_response["code"] = 400;
            $_response["status"] = false;

            echo json_encode($_response);
        } else {
            $username_get = trim($_POST['username']);
            $password_get = trim($_POST['password']);

            $querysearch_user = mysqli_query($_AUTH, "SELECT * FROM tbl_user WHERE username_user = '$username_get' AND password_user = '$password_get'");
            $_response = array();
            $execute_querylogin = mysqli_num_rows($querysearch_user);

            if ($execute_querylogin > 0) {
                $_response["informasi_user"] = array();

                while ($row = mysqli_fetch_array($querysearch_user)) {
                    $fetch_datauser = array();

                    $fetch_datauser["kode_user"] = $row["kode_user"];
                    $fetch_datauser["namalengkap_user"] = $row["namalengkap_user"];
                    $fetch_datauser["jeniskelamin_user"] = $row["jeniskelamin_user"];
                    $fetch_datauser["username_user"] = $row["username_user"];
                    $fetch_datauser["password_user"] = $row["password_user"];
                    $fetch_datauser["email_user"] = $row["email_user"];
                    $fetch_datauser["picture"] = $row["picture"];
                    $fetch_datauser["user_craeted"] = $row["user_craeted"];

                    $_response["message"] = trim("Login successfully.");
                    $_response["code"] = 200;
                    $_response["status"] = true;

                    array_push($_response["informasi_user"], $fetch_datauser);
                }
                echo json_encode($_response);
            } else {
                $_response["message"] = trim("Login failed. Check your Username & Password Again.");
                $_response["code"] = 400;
                $_response["status"] = false;
                echo json_encode($_response);
            }
        }
    } else {
        $_response["message"] = trim("Forbidden.");
        $_response["code"] = 403;
        $_response["status"] = false;
        echo json_encode($_response);
    }
?>