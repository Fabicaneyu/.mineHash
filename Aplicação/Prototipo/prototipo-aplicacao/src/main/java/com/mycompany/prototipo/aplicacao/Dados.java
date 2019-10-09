package com.mycompany.prototipo.aplicacao;

public class Dados extends CapturaDadosOshi {

    // vamos instanciar a classe que será necessária para executar o envio
    // de dados ao banco
    ConexaoBanco conexaoBanco = new ConexaoBanco();

    public void enviarDados() {

        // aqui chamamos o método de montagem de conexão ao banco que criamos
        // na classe ConexaoBanco :)
        conexaoBanco.montarConexao();

        // agora aplicamos o método vindo direto do JDBC para a construção da 
        // nossa query
        // independente do que você quer fazer, seja select ou insert, o método
        // sempre será ****.template().update(), então cuidado pra não confundir :)
        // e como pode ser visto abaixo, vamos usar a instância que criamos (dadosAplicacao)
        // você pode ver que não podemos inserir os dados que queremos direto na query,
        // então temos que fazer concatenação
        // no insert temos que mencionar os campos que iremos realizar a inserção
        // e após "values", temos que colocar "?" para cada campo mencionado
        // depois, iremos colocar os dados que queremos e que irão substituir os "?"
        // LEMBRE-SE DE COLOCAR OS DADOS NA ORDEM QUE VOCÊ COLOCOU OS CAMPOS
        conexaoBanco.template().update(
                "insert into Computador (hostname,fabricante,modelo,processador,memoriaTotal,memoriaDisp,"
                + "sistemaOperacional) values (?,?,?,?,?,?,?)",
                getHostname(), getFabricante(), getModelo(), getProcessador(),
                getMemoriaTotal(), getMemoriaDisp(), getSistemaOperacional());

    }
}
