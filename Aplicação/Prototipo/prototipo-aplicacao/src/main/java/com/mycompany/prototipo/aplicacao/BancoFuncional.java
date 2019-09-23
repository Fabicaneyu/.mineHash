package com.mycompany.prototipo.aplicacao;

public class BancoFuncional {

    public static void main(String[] args) {

        PrototipoAplicacao teste = new PrototipoAplicacao();

        System.out.println(teste.Fabricante());
        System.out.println(teste.Modelo());
        System.out.println(teste.Processador());
        System.out.println(teste.MemoriaTotal());
        System.out.println(teste.MemoriaDisp());

        ConexaoBanco conectar = new ConexaoBanco();
        conectar.getConnection();

       Dados inserir = new Dados();
       inserir.EnviarBanco();
       

        System.out.println(conectar.template().queryForList("select * from Computador"));

    }
}
