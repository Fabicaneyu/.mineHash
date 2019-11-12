function verificacao() {
    if (nome_usuario.value == "" || data_usuario.value == "" || cpf_cnpj_usuario.value == "" || contato_usuario.value == "" ||
        senha_usuario.value == "" || email_usuario.value == "") {

        alert('Por favor preencha todos os campos');

    }
    else {
        cadastrar();

    }


}



function cadastrar() {

    espera();
    console.log('EFETUANDO CADASTRO');


    var formulario = new URLSearchParams(new FormData(modal_cadastro));
    fetch('/usuarios/cadastrar', {
        method: "POST",
        body: formulario
    }).then(function (response) {

        console.log(`entrando no if response`);


        if (response.ok) {

            console.log(`entrando`);

            response.json().then(function (resposta) {

                console.log('tô antes do if(resposta "!= false)');
                if (resposta != false) {
                    console.log('entrei');
                    console.log('Cadastrado com sucesso!');

                    console.log(resposta);
                    finalizar_espera();
                    window.location.href = "dashboard.html";

                }
                else{
                    console.log('erro de cadastro DE NOVO');
                }



            });

        } else {

            console.log(response);

            console.log('Erro de cadastro!');
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

