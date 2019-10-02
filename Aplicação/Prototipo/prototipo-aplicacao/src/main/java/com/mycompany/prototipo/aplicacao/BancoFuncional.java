package com.mycompany.prototipo.aplicacao;

public class BancoFuncional {

    public static void main(String[] args) {

        PrototipoAplicacao teste = new PrototipoAplicacao();
        teste.caminhoProcesso();

        System.out.println(teste.fabricante());
        System.out.println(teste.modelo());
        System.out.println(teste.processador());
        System.out.println(teste.memoriaTotal());
        System.out.println(teste.memoriaDisp());
        System.out.println(teste.caminhoProcesso());
        
        ConexaoBanco conectar = new ConexaoBanco();
        conectar.getConnection();

        Dados inserir = new Dados();
        inserir.enviarBanco();
        
        MandarSMS relatorio = new MandarSMS();
        relatorio.enviarSMS();
        System.out.println(conectar.template().queryForList("select * from Computador"));
        

    }
}
