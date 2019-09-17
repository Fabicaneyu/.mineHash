// verificarAutenticacao();

function verificarAutenticacao() {
    if (sessionStorage.nome_usuario != undefined) {
        window.location.href = 'dashboard.html';
    }
}

function validacao() {
    if (entrada_login.value != "" && entrada_senha.value != "") {
        entrar();
    }
    else {
        alert('Por favor preencha todos os campos');
    }
}

function entrar() {
    console.log('EFETUANDO LOGIN...');

    aguardar();
    var formulario = new URLSearchParams(new FormData(form_login));
    fetch('/usuarios/entrar', {
        method: "POST",
        body: formulario
    }).then(function (response) {
        console.log(`entrando no if`);
        if (response.ok) {
            console.log(`entrando`);
            response.json().then(function (resposta) {
                sessionStorage.nome_usuario = resposta.NOME;
                sessionStorage.email_usuario = resposta.EMAIL;
                console.log(`${sessionStorage.nome_usuario},${sessionStorage.email_usuario}`);
                verificarAutenticacao();
            });
        } else {
            alert('Login ou senha inválidos');
            entrada_login.value = "";
            entrada_senha.value = "";
            console.log('Erro de login!');
            finalizar_aguardar();
        }
    });
    return false;
}

function aguardar() {
    btn_entrar.disabled = true;
    carregando.src = "img/loading.gif";
}

function finalizar_aguardar() {
    btn_entrar.disabled = false;
    carregando.src = "";
}