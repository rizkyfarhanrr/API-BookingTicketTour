<?php
    $_SERVER_DB = "localhost";
    $_USERNAME_DB = "id12929892_usr_wisataindonesia";
    $_PASSWORD_DB = "!!@&!*))>?!!453p714d!";
    $_DATABASE_DB = "id12929892_db_wisataindonesia";

    $_AUTH = mysqli_connect($_SERVER_DB, $_USERNAME_DB, $_PASSWORD_DB, $_DATABASE_DB);

    if ($_AUTH) {
        echo json_encode(array(
            "message" => "Congratulation!, your connection is successfully.", 
            "code" => 200, 
            "status" => true)
        );
    }
?>