package com.mycompany.prototipo.aplicacao;

public class Aplicacao {

    ConexaoBanco conectar = new ConexaoBanco();
    Dados dados = new Dados();
   // RelatorioSMS relatorio = new RelatorioSMS();
   JsensorTeste Jsensor = new JsensorTeste();

    public Aplicacao() {

  //      conectar.montarConexao();
    //    dados.enviarDados();
        Jsensor.puxarGPU();
      //relatorio.enviarSMS();

        //System.out.println(conectar.template().queryForList("select * from tb_processo"));
    }

}
