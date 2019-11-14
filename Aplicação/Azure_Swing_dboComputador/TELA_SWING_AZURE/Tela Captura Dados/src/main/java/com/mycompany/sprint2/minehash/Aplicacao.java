package com.mycompany.sprint2.minehash;

public class Aplicacao {

    ConexaoBanco banco = new ConexaoBanco(); //Aqui vc estará instanciando novamente a classe ConexaoBanco, porém com um novo nome de objeto
    MetodoBanco inserir = new MetodoBanco();
    
    public Aplicacao() {
        
        banco.getConnection();
        inserir.enviarBanco(); // é o void criado na classe MetodoBanco
        
        System.out.println(banco.template().queryForList(
                "select * from dbo.Computador"));
        
    }  

}
