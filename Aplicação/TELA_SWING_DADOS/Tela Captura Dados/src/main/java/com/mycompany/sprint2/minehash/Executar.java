package com.mycompany.sprint2.minehash;

/**
 *
 * @author HP x360
 */
public class Executar {

//    DadosOshi capturadados = new DadosOshi();
    public static void main(String[] args) {

        ConexaoBanco banco = new ConexaoBanco();
        MetodoBanco inserir = new MetodoBanco();

        banco.getConnection();
//        inserir.enviarBanco();
        
        System.out.println(banco.template().queryForList("select * from Computador"));

    }

}
