
package com.mycompany.sprint2.minehash;


public class MetodoBanco extends DadosOshi {
    
    
    ConexaoBanco conexao = new ConexaoBanco();
    
    public void enviarBanco() {
        conexao.getConnection();
        conexao.template().update(
                "insert into TesteOshi (PROCESSADOR,RAM,FABRICANTE) values (?,?,?)",
                getProcessador(), getMemoriaTotal(), getFabricante());

    }
    
    
}
