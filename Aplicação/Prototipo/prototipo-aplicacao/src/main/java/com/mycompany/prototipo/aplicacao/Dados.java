package com.mycompany.prototipo.aplicacao;

public class Dados extends CapturaDadosOshi {

    // vamos instanciar a classe que será necessária para executar o envio
    // de dados ao banco
    ConexaoBanco conexaoBanco = new ConexaoBanco();
    Processos processo = new Processos();

    public void enviarDados() {

       
        conexaoBanco.montarConexao();
        processo.puxarProcessos();
       
//        conexaoBanco.template().update(
//                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
//                + "sistemaOperacional) values (?,?,?,?,?,?,?)",
//                getHostname(), getFabricante(), getModelo(), getProcessador(),
//                getMemoriaTotal(), getMemoriaDisp(), getSistemaOperacional());

        conexaoBanco.template().update(
                "insert into tb_processo (pid, nome_processo, prioridade) values (?,?,?)",
                processo.getIdProcesso(), processo.getNomeProcesso(), processo.getPrioridadeProcesso()
        );

    }

}
