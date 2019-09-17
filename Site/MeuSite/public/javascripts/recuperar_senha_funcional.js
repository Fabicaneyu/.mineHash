function verificarAutenticacao() {
    if (sessionStorage.email_rec != undefined) {
        window.location.href = 'mudar_senha.html';
    }
}

function validacao() {
    if (email.value != "") {
        recuperar();
    }
    else {
        alert('Por favor preencha todos os campos');
    }
}

function recuperar() {
    console.log('INICIANDO RECUPERAÇÃO...');

    aguardar();
    var formulario = new URLSearchParams(new FormData(form_recuperacao));
    fetch('/usuarios/recuperar', {
        method: "POST",
        body: formulario
    }).then(function (response) {
        if (response.ok) {
            response.json().then(function (resposta) {
                sessionStorage.email_rec = resposta.EMAIL;
                verificarAutenticacao();
            });
        } else {
            alert('Email digitado é inválido!');
            email.value = "";
            
            console.log('Erro em iniciar recuperação!');
            finalizar_aguardar();
        }
    });
    return false;
}

function aguardar() {
    btn_recuperar.disabled = true;
}

function finalizar_aguardar() {
    btn_recuperar.disabled = false;
}