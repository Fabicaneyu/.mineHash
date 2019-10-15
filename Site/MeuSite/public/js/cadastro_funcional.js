function validacao() {
    if (nome_usuario.value != "" && email.value != "" && telefone_usuario.value != "" && cpf_usuario.value != "" &&
        senha_usuario.value != "" && confirmacao_senha.value != "") {
            if (senha_usuario.value.length < 8) {
                alert('A senha deve conter 8 ou mais caracteres')
                senha_usuario.value = "";
            }
        if (senha_usuario.value != confirmacao_senha.value) {
            alert('Por favor confirme a senha corretamente');
            confirmacao_senha.value="";
        }
        else if(cb_termos.checked == false){
            alert('Por favor aceite os termos de uso');
        }
        else {
            cadastrar();
        }
    }
    else {
        alert('Por favor preencha todos os campos');
    }

}

    
    
    
        

    



function cadastrar() {
    console.log('EFETUANDO CADASTRO');

    aguardar();
    var formulario = new URLSearchParams(new FormData(form_cadastro));
    fetch('/usuarios/cadastrar', {
        method: "POST",
        body: formulario
    }).then(function (response) {

        if (response.ok) {
            aguardar();
            console.log('Entrou na função cadastrar');
           
            response.json().then(function (resposta) {
                if (resposta == false) {
                    alert('Algo deu errado!');
                    finalizar_aguardar();
                } else {
                    // alert('Usuário cadastrado com sucesso!').then(function () {
                         sessionStorage.ID_USUARIO = resposta.id;
                         window.location.href = 'cadastro_endereco.html';
                    // })
                }


            });
        } else {

            console.log('Erro de cadastro!');
            console.log('Não entrou na função cadastrar');
            finalizar_aguardar();
        }
    });

    return false;
}

function aguardar() {
    btn_cadastrar.disabled = true;


}

function finalizar_aguardar() {
    btn_cadastrar.disabled = false;


}