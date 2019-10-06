package com.mycompany.prototipo.aplicacao;

public class Aplicacao {
    
    // vamos instanciar nossas classes necessárias para fazer o conjunto funcionar
    
    ConexaoBanco conectar = new ConexaoBanco();
    Dados dados = new Dados();
    RelatorioSMS relatorio = new RelatorioSMS();

    public Aplicacao() {
        
        // agora vamos chamar os métodos que criamos nas classes: o para montar
        // nossa conexão com o banco, o de envio de dados ao banco e por último
        // o método extra que envia relatórios para o usuário
        
        // caso você não saiba direito como funciona o do envio de relatório,
        // deixe a instancia da classe RelatorioSMS comentada e a linha
        // relatorio.enviarSMS(): comentada também :)
        
        conectar.montarConexao();
        dados.enviarDados();
        relatorio.enviarSMS();
        
        System.out.println(conectar.template().queryForList("select * from Computador"));
    }


}
