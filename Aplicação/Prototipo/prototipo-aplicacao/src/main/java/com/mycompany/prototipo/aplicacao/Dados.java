package com.mycompany.prototipo.aplicacao;

public class Dados extends CapturaDadosOshi {

    // vamos instanciar a classe que será necessária para executar o envio
    // de dados ao banco
    ConexaoBanco conexaoBanco = new ConexaoBanco();

    public void enviarDados() {

        conexaoBanco.montarConexao();

//        conexaoBanco.template().update(
//                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
//                + "sistemaOperacional) values (?,?,?,?,?,?,?)",
//                getHostname(), getFabricante(), getModelo(), getProcessador(),
//                getMemoriaTotal(), getMemoriaDisp(), getSistemaOperacional());
    }

}
