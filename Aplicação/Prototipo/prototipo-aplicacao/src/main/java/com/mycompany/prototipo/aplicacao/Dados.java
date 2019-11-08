package com.mycompany.prototipo.aplicacao;

public class Dados extends CapturaDadosOshi {

    // vamos instanciar a classe que será necessária para executar o envio
    // de dados ao banco
    ConexaoBanco conexaoBanco = new ConexaoBanco();

   
    public void enviarDados() {

        conexaoBanco.montarConexao();

        conexaoBanco.template().update(
                "insert into Computador (idComp,GPU,DISCO,RAM,Processador,SO,Hostname,Fabricante,Modelo,fkMinerador"
                + ") values (,null,null,null,?,?,?,?,?,?,null)",
               getMemoriaTotal() ,getProcessador(),getSistemaOperacional(), 
               getHostname() ,getFabricante(), getModelo() 
                 );
    }

}