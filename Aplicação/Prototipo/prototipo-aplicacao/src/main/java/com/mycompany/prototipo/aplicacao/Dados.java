package com.mycompany.prototipo.aplicacao;

public class Dados {

    PrototipoAplicacao dadosApp = new PrototipoAplicacao();
    ConexaoBanco insert = new ConexaoBanco();
//    private String nome = "Marcelo";
//    private String sobrenome = "Lixo";

    public void EnviarBanco() {
        insert.getConnection();
        insert.template().update(
                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
                + "sistemaOperacional) values (?,?,?,?,?,?,?)",
                dadosApp.Hostmame(), dadosApp.Fabricante(), dadosApp.Modelo(),
                dadosApp.Processador(), dadosApp.MemoriaTotal(), dadosApp.MemoriaDisp(),
                dadosApp.SistemaOperacional());

    }
}
