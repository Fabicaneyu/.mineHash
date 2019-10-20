
package com.mycompany.sprint2.minehash;


public class MetodoBanco extends DadosOshi {
    
    
    ConexaoBanco conexao = new ConexaoBanco();
    
    public void enviarBanco() {
        conexao.getConnection();
        conexao.template().update(
                "insert into tb_computador (hostname, processador, ram,"
                        +"disco,so,gpu,modelo) values (?,?,?,?,?,?,?)",
                getHostname(),getProcessador(),getMemoriaTotal(),getDisco(),
                getSo(),getGpu(),getModelo());
    }
}
