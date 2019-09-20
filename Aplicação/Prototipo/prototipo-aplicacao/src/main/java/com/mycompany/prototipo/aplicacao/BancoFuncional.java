package com.mycompany.prototipo.aplicacao;

public class BancoFuncional {

    public static void main(String[] args) {

        ConexaoBanco conectar = new ConexaoBanco();
        conectar.getConnection();

        Dados inserir = new Dados();
        inserir.EnviarBanco();
        System.out.println(conectar.template().queryForList("select * from tb_teste"));

    }
}
