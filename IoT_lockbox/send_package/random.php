<html>
<head>
<title>My first PHP script</title>
</head>
<body>
<?php
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
  $passcode = randomPassword();              
  echo $passcode;
?>

</body>
</html>


