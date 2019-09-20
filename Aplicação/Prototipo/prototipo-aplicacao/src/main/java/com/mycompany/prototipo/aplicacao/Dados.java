package com.mycompany.prototipo.aplicacao;

public class Dados {

    private String nome = "Marcelo";
    private String sobrenome = "Lixo";

    public void EnviarBanco() {
        ConexaoBanco insert = new ConexaoBanco();
        insert.getConnection();
        insert.template().update(
                "insert into tb_teste (nome,sobrenome) "
                + "values (?,?)", nome, sobrenome);
    }
}