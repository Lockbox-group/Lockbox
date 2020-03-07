function login() {
 
    var username = document.getElementById("student_ID");
    var pass = document.getElementById("passcode");
 
    if (username.value == "") {
 
        alert("please enter the username");
 
    } else if (pass.value  == "") {
 
        alert("please enter the passward");
 
    } else if(username.value == "admin" && pass.value == "123456"){
 
        window.location.href="welcome.html";
 
    } else {
 
        alert("please enter the correct name and password")
 
    }
}
