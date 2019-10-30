// importScripts("//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js");

function statusChangeCallback(response) {  // Called with the results from FB.getLoginStatus().
    console.log('statusChangeCallback');
    console.log(response);                   // The current login status of the person.
    if (response.status === 'connected') {
        if(response.name == null){
            console.log('sem resposta');
            alert('sem resposta');

        }
        else{
            testAPI();
            getUserInfo();
            entrarDashboard();
        } // Logged into your webpage and Facebook.
        
        
        

    } else {                                 // Not logged into your webpage or we are unable to tell.
        document.getElementById('status').innerHTML = 'Please log ' +
            'into this webpage.';
    }
}


function checkLoginState() {               // Called when a person is finished with the Login Button.
    FB.getLoginStatus(function (response) {   // See the onlogin handler
        statusChangeCallback(response);
    });
}


window.fbAsyncInit = function () {
    FB.init({
        appId: '1020754554935134',
        cookie: true,                     // Enable cookies to allow the server to access the session.
        xfbml: true,                     // Parse social plugins on this webpage.
        version: 'v4.0'           // Use this Graph API version for this call.
    });


    FB.getLoginStatus(function (response) {   // Called after the JS SDK has been initialized.
        statusChangeCallback(response);        // Returns the login status.
    });
};


(function (d, s, id) {                      // Load the SDK asynchronously
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));


function testAPI() {                      // Testing Graph API after login.  See statusChangeCallback() for when this call is made.
    console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function (response) {
        console.log('Successful login for: ' + response.name);
        document.getElementById('status').innerHTML =
            'Thanks for logging in, ' + response.name + '!';
    });
}

function entrarDashboard() {
    window.location.href = "../dashboard.html";

}

function getUserInfo() {
     FB.api('/me?fields=name,email,gender,birthday,link', function(response) {
        
        var str = "<b>Name</b> : " + response.name + "<br>";
        str += "<b>Link: </b>" + response.link + "<br>";
        str += "<b>Username:</b> " + response.username + "<br>";
        str += "<b>id: </b>" + response.id + "<br>";
        str += "<b>Email:</b> " + response.email + "<br>";
        str += "<input type='button' value='Get Photo' onclick='getPhoto();'/>";
        str += "<input type='button' value='Logout' onclick='Logout();'/>";
        document.getElementById("status").innerHTML = str;
        
     }, { scope: 'email, user_about_me, user_birthday, user_hometown' });

     
}

function getPhoto() {
FB.api('/me/picture?type=normal', function(response) {
  var str="<br/><b>Pic</b> : <img src='"+response.data.url+"'/>";
  document.getElementById("status").innerHTML+=str;
});
}

function usuario_conectado() {
    FB.api('/me', function(response) {
        console.log(response);
        document.getElementById("usuario_logado").innerHTML = response.username;

    });




}



   





