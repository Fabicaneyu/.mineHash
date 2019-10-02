function verificarAutenticacao() {
    if (sessionStorage.nova_senha_rec != undefined) {
        window.location.href = 'login.html';
    }
}

function validacao() {
    if (senha_usuario.value != "") {
        alterar();
    }
    else {
        alert('Por favor preencha todos os campos');
    }
}

function alterar() {
    console.log('INICIANDO ALTERAÇÃO...');

    aguardar();
    var formulario = new URLSearchParams(new FormData(form_alterar));
    fetch('/usuarios/alterar', {
        method: "POST",
        body: formulario
    }).then(function (response) {
        if (response.ok) {
            // response.json().then(function (resposta) {
            //     sessionStorage.nova_senha_rec = resposta.SENHA;
            //     verificarAutenticacao();
            // });
            alert('Alteração bem sucedida!');
            finalizar_aguardar();
            window.location.href = 'login.html';
        } else {
            alert('Senha digitada é inválida!');
            senha_usuario.value = "";
            
            console.log('Erro em iniciar alteração!');
            finalizar_aguardar();
        }
    });
    return false;
}

function aguardar() {
    btn_alterar.disabled = true;
}

function finalizar_aguardar() {
    btn_alterar.disabled = false;
}