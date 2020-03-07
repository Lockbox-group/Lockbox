function login() {
 
    var username = document.getElementById("username");
    var pass = document.getElementById("password");
 
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
