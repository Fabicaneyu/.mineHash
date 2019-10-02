package com.mycompany.prototipo.aplicacao;

public class Dados {

    PrototipoAplicacao dadosApp = new PrototipoAplicacao();
    ConexaoBanco insert = new ConexaoBanco();
//    private String nome = "Marcelo";
//    private String sobrenome = "Lixo";

    public void enviarBanco() {
        insert.getConnection();
        insert.template().update(
                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
                + "sistemaOperacional) values (?,?,?,?,?,?,?)",
                dadosApp.hostname(), dadosApp.fabricante(), dadosApp.modelo(),
                dadosApp.processador(), dadosApp.memoriaTotal(), dadosApp.memoriaDisp(),
                dadosApp.sistemaOperacional());

    }
}
