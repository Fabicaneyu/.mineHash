// verificarAutenticacao();

function verificarAutenticacao() {
    if (sessionStorage.email != undefined) {
        window.location.href = 'dashboard.html';
    }
}

function validacao() {
    if (email.value != "" && senha.value != "") {
        entrar();
    }
    else {
        alert('Por favor preencha todos os campos');
    }
}

function entrar() {
    console.log('EFETUANDO LOGIN...');

    aguardar();
    var formulario = new URLSearchParams(new FormData(modal_login));
    fetch('/usuarios/entrar', {
        method: "POST",
        body: formulario
    }).then(function (response) {
        console.log(`entrando no if`);
        if (response.ok) {
            console.log(`entrando`);
            response.json().then(function (resposta) {
                sessionStorage.email = resposta.EMAIL;
                sessionStorage.senha = resposta.SENHA;
                console.log(`${sessionStorage.email},${sessionStorage.senha}`);
                verificarAutenticacao();
            });
        } else {
            alert('Login ou senha inválidos');
            email_usuario.value = "";
            senha_usuario.value = "";
            console.log('Erro de login!');
            finalizar_aguardar();
        }
    });
    return false;
}

function aguardar() {
    btn_login.disabled = true;
    // carregando.src = "img/loading.gif";
}

function finalizar_aguardar() {
    btn_login.disabled = false;
    // carregando.src = "";
}
    // var cod_usuario = {'ID_USUARIO':sessionStorage.ID_USUARIO}
    // fetch('/leituras/pegar_codigo', {
    //     method: "POST",
    //     body: cod_usuario
    // })