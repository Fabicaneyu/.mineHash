function validacao() {
    if (bairro_end.value != "" && rua_end.value != "" && numero_end.value != "" && cep_end.value != "" &&
        comp_end.value != "") {
        // if (senha_usuario.value != confirmacao_senha.value) {
        //     alert('Por favor confirme a senha corretamente');
        //     confirmacao_senha.value="";
        // }
        // else if(cb_termos.checked == false){
        //     alert('Por favor aceite os termos de uso');
        // }
        
            cadastrar_endereco();
        
    }
    else {
        alert('Por favor preencha todos os campos');
    }

}


function cadastrar_endereco() {
    console.log('EFETUANDO CADASTRO DO ENDEREÇO');

    aguardar();
    fk.value = sessionStorage.ID_USUARIO; 
    var formulario = new URLSearchParams(new FormData(form_endereco));
    // formulario.append('ID_USUARIO', sessionStorage.ID_USUARIO);
    
    
    fetch('/usuarios/cadastrar_endereco', {
        method: "POST",
        body: formulario
    }).then(function (response) {
        console.log('Entrou na função de cadastrar endereço');
        if (response.ok) {
            response.json().then(function (resposta) {
                if (resposta != false) {
                 
                        // sessionStorage.removeItem('ID_USUARIO');
                        window.location.href = 'cadastro_estufa.html';
                    
                } else {
                    alert('Algo deu errado');
                    finalizar_aguardar();
                }

            });

        } else {

            console.log('Erro de cadastro!');
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