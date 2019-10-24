window.fbAsyncInit = function () {
    FB.init({
        appId: '{1020754554935134}',
        cookie: true,
        xfbml: true,
        version: '{v4.0}'
    });

    FB.AppEvents.logPageView();

};

(function (d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) { return; }
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));


FB.getLoginStatus(function (response) {
    statusChangeCallback(response);

});


function checkLoginState() {
    FB.getLoginStatus(function (response) {
        statusChangeCallback(response);
 
    });
}

function statusChangeCallback(response) {  // Called with the results from FB.getLoginStatus().
    console.log('statusChangeCallback');
    console.log(response);                   // The current login status of the person.
    if (response.status === 'connected') {   // Logged into your webpage and Facebook.
      testAPI();  
    } else {                                 // Not logged into your webpage or we are unable to tell.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this webpage.';
    }
  }

  
  function testAPI() {                      // Testing Graph API after login.  See statusChangeCallback() for when this call is made.
    console.log('Bem vindo! Validando informações.... ');
    FB.api('/me', function(response) {
      console.log('Login bem sucedido: ' + response.name);
      document.getElementById('status').innerHTML =
        'Obrigado por fazer login, ' + response.name + '!';
        
    });
  }

  function entrarDashboard() {
    window.location.href = "../dashboard.html";
    
  }
