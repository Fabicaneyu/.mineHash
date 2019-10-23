function verificacao() {
    if (nome_usuario == "" || data_usuario == "" || cpf_cnpj_usuario == "" || contato_usuario == "" ||
        cep == "" || cidade == "" || bairro == "" || uf == "" || numero_endereco == "" ||
        rua == "" || senha_usuario == "" || email_usuario == "") {

        alert('Por favor preencha todos os campos');

    }
    else {
        cadastrar();

    }


}



function cadastrar() {
    console.log('EFETUANDO CADASTRO');

    espera();
    var formulario = new URLSearchParams(new FormData(modal_cadastro));
    fetch('/usuarios/cadastrar', {
        method: "POST",
        body: formulario
    }).then(function (response) {

        if (response.ok) {
            // espera();
            console.log('Entrou na função cadastrar');

            response.json().then(function (resposta) {
                if (resposta = false) {
                    alert('Algo deu errado!');
                    finalizar_espera();
                    
                } else {
                    // alert('Usuário cadastrado com sucesso!').then(function () {
                    // sessionStorage.ID_USUARIO = resposta.id;
                    window.location.href = 'dashboard.html';
                    sessionStorage.email_usuario = resposta.EMAIL;
                    sessionStorage.senha_usuario = resposta.SENHA;  
                    // })
                }


            });
        } else {

            console.log('Erro de cadastro!');
            console.log('Não entrou na função cadastrar');
            finalizar_espera();
        }
    });

    return false;
}

function espera() {
    btn_cadastrar.disabled = true;


}

function finalizar_espera() {
    btn_cadastrar.disabled = false;


}
