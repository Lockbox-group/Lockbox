<?php


	$enteredStudentID = $_POST ['student_id']; 
    $enteredPasscode = $_POST ['passcode']; 
	
	include('connectDB.php');
	if($result = $mysqli->query("SELECT * FROM `lockbox` WHERE id = '$enteredStudentID' and passcode = '$enteredPasscode' and hasPackage = 1") ){

    /* determine number of rows result set */
		$row_cnt = $result->num_rows;
		if($row_cnt>0){
			//if match, delete the row
				$resultDelete = $mysqli->query("DELETE FROM `lockbox` WHERE `lockbox`.`id` = '$enteredStudentID' and `lockbox`.`passcode` = '$enteredPasscode' and `lockbox`.`hasPackage` = 1");
				echo '<script>window.location.href = "../student/student.html";</script>';
				$result->close();

				}
		else{
				echo '<script> alert("Error opening lockbox, please enter the correct information");window.location.href = "index.html";</script>';
				$result->close();
	}
}
$mysqli->close();


?>
