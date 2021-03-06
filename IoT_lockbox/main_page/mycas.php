<?php
ini_set('display_errors',1);
ini_set('display_startup_errors',1);
error_reporting(E_ALL);

/**
 *   Example for a simple cas 2.0 client
 *
 * PHP Version 5
 *
 * @file     example_simple.php
 * @category Authentication
 * @package  PhpCAS
 * @author   Joachim Fritschi <jfritschi@freenet.de>
 * @author   Adam Franco <afranco@middlebury.edu>
 * @license  http://www.apache.org/licenses/LICENSE-2.0  Apache License 2.0
 * @link     https://wiki.jasig.org/display/CASC/phpCAS
 */

// Load the settings from the central config file
//require_once 'config.php';
// Load the CAS lib
require_once './CAS.php';

$cas_host = 'login.oregonstate.edu';
$cas_port = 443;
$cas_context = 'cas';
// Enable debugging
//phpCAS::setDebug();
// Enable verbose error messages. Disable in production!
phpCAS::setVerbose(true);

// Initialize phpCAS
phpCAS::client(CAS_VERSION_2_0, $cas_host, $cas_port, $cas_context);

// For production use set the CA certificate that is the issuer of the cert
// on the CAS server and uncomment the line below
// phpCAS::setCasServerCACert($cas_server_ca_cert_path);


//email:sum@oregonstate.edu
//title:myfirstemail
//content:hello world
//mail("sum@oregonstate.edu","myfirstemail","hello world");

// For quick testing you can disable SSL validation of the CAS server.
// THIS SETTING IS NOT RECOMMENDED FOR PRODUCTION.
// VALIDATING THE CAS SERVER IS CRUCIAL TO THE SECURITY OF THE CAS PROTOCOL!
phpCAS::setNoCasServerValidation();

// force CAS authentication
phpCAS::forceAuthentication();

// at this step, the user has been authenticated by the CAS server
// and the user's login name can be read with phpCAS::getUser().

// logout if desired
if (isset($_REQUEST['logout'])) {
	phpCAS::logout();
}

// for this test, simply print that the authentication was successfull
?>


<html>
<?php
include ('connectDB.php');
//if ($mysqli->connect_errno) {
  //  echo "Failed to connect to MySQL: (" . $mysqli->connect_errno . ") " . $mysqli->connect_error;
//}
//echo 'Successfully connected to database!';
//mysql_select_db("kuangqi-db", $mysqli);
$username = phpCAS::getUser();
if($result = $mysqli->query("SELECT * FROM `lockbox` WHERE onid = '$username' and isAdmin = 1") ){

    /* determine number of rows result set */
 $row_cnt = $result->num_rows;
 if($row_cnt>0){
	 echo '<script>window.location.href = "../login/login.html";</script>';
	
	 $result->close();

 }
 else{
	 echo '<script> alert("you are not admin");window.location.href = "index.html";</script>';
	 $result->close();
 }
}

/* close connection */
$mysqli->close();
?>
</html>

<!-- comment
<html>
<head>
<title>phpCAS simple client</title>
</head>
<body>
<h1>Successfull Authentication!</h1>
<?php require 'script_info.php' ?>
<p>the user's login is <b><?php echo phpCAS::getUser(); ?></b>.</p>
<p>phpCAS version is <b><?php echo phpCAS::getVersion(); ?></b>.</p>
<p><a href="?logout=">Logout</a></p>
</body>
</html>
-->
