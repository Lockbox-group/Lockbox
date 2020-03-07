<?php

$dbhost = 'oniddb.cws.oregonstate.edu';
$dbname = 'kuangqi-db';
$dbuser = 'kuangqi-db';
$dbpass = 'gqiXNV35XA7tLSkn';

$mysqli = new mysqli($dbhost, $dbuser, $dbpass, $dbname);
if ($mysqli->connect_errno) {
    echo "Failed to connect to MySQL: (" . $mysqli->connect_errno . ") " . $mysqli->connect_error;
}


//CREATE TABLE "lockbox" ONCE
echo 'Successfully connected to database!';
$sql = "CREATE TABLE IF NOT EXISTS lockbox(
    _id INT PRIMARY KEY AUTO_INCREMENT,
    onid VARCHAR(20),
    isAdmin BOOL default false,
    hasPackage BOOL default false,
    id INT,
    boxNum INT,
    passcode VARCHAR(6),
    time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    email VARCHAR(70)
)";
if(mysqli_query($mysqli, $sql)){
    echo "Table created successfully.";
} else{
    echo "ERROR: Could not able to execute $sql. " . mysqli_error($mysqli);
}


//INSERT ADMIN HERE!!


$sqlInsert2 = "INSERT INTO lockbox (onid,isAdmin)
VALUES ('sum',true)";

if (mysqli_query($mysqli, $sqlInsert2)) {
    echo "New record created successfully";
} else {
    echo "Error2";
}

$mysqli->close();

?>
