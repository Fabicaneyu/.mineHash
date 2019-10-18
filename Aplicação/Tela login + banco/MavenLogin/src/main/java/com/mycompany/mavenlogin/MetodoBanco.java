
package com.mycompany.mavenlogin;


public class MetodoBanco {
    
    
    ConexaoBanco conexao = new ConexaoBanco();
    protected String login;
    protected String senha;
    
    public void ConsultaBanco() {
        conexao.getConnection();
        conexao.template().update(
                "select * from Acesso");

    }
    
    
}
