
package com.mycompany.sprint2.minehash;


public class MetodoBanco {
    
    DadosOshi dados = new DadosOshi();
    ConexaoBanco conexao = new ConexaoBanco();
    
    public void enviarBanco() {
        conexao.getConnection();
        conexao.template().update(
                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
                + "sistemaOperacional) values (?)",
                dados.processador());

    }
    
    
}
