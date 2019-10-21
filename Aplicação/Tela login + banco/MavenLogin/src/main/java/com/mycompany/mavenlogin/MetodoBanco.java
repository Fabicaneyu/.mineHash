package com.mycompany.mavenlogin;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import Login;

public class MetodoBanco extends Login {

    ConexaoBanco conexao = new ConexaoBanco();

    String login;
    String senha;

    public MetodoBanco() {

//       login = getTfLogin().toString();
//       senha = getTfSenha().toString();

        login = "leo@teste";
        senha = "1234";

       
        conexao.getConnection();
        consultaBanco();

    }

    public void consultaBanco() {

        conexao.template().update(
                "select * from Acesso where login = '?' and senha = '?'", login, senha);

        

    }

    public static void main(String[] args) {

        MetodoBanco teste = new MetodoBanco();

    }

}
