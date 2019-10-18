/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenlogin;


public class MetodoLogin  {
    
  public static void main(String[] args){
        ConexaoBanco banco = new ConexaoBanco();
        MetodoBanco inserir = new MetodoBanco();

        banco.getConnection();
//        inserir.enviarBanco();
        
        System.out.println(banco.template().queryForList("select * from Acesso"));

    }
}
 