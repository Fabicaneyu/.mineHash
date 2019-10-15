package com.mycompany.sprint2.minehash;

/**
 *
 * @author HP x360
 */
public class Aplicacao {

    ConexaoBanco banco = new ConexaoBanco();
    MetodoBanco inserir = new MetodoBanco();
    
    public Aplicacao() {
        
        banco.getConnection();
        inserir.enviarBanco();
        
        System.out.println(banco.template().queryForList("select * from TesteOshi"));
        
    }

  
    

}
