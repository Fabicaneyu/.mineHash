package com.mycompany.prototipo.aplicacao;

public class Aplicacao {

    ConexaoBanco conectar = new ConexaoBanco();
    Dados dados = new Dados();
    RelatorioSMS relatorio = new RelatorioSMS();
   

    public Aplicacao() {

        conectar.montarConexao();
        dados.enviarDados();
        
      relatorio.enviarSMS();

        System.out.println(conectar.template().queryForList("select * from tb_processo"));
    }

}
