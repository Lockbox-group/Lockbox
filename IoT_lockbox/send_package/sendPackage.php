<?php
//header ("Content-Type: text / html; charset = utf8" );
function randomPassword() {
    $alphabet = '1234567890';
    $pass = array(); //remember to declare $pass as an array
    $alphaLength = strlen($alphabet) - 1; //put the length -1 in cache
    for ($i = 0; $i < 6; $i++) {
        $n = rand(0, $alphaLength);
        $pass[] = $alphabet[$n];
    }
    return implode($pass); //turn the array into a string
}

	$studentID = $_POST ['student_id']; 
    $email = $_POST ['student_email']; 
	$boxNum = $_POST['box_num'];
	$passcode = randomPassword();
    mail($email,"New package","Hello,\r\n You got a pack at box# $boxNum and the passcode is $passcode.\r\n Please go to the TekBots and click the link to open your box.\r\n Link: http://web.engr.oregonstate.edu/~sum/IoT_lockbox/main_page/");
	include ('connectDB.php');
	$sqlInsert = "INSERT INTO lockbox (id,hasPackage,boxNum,passcode,email) VALUES ('$studentID', true, '$boxNum', '$passcode','$email')";

	if (mysqli_query($mysqli, $sqlInsert)) {
		 //echo '<script>window.location.href = "../student/student.html";</script>';
         echo '<script>window.location.href = "../send_result/send_result.html";</script>';
		} 
		
	$mysqli->close();
?>
