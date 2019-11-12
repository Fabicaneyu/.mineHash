package com.mycompany.prototipo.aplicacao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource montarConexao() {

        try {
            conexao.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conexao.setUrl("jdbc:sqlserver://mineservidor.database.windows.net:1433;"
                    + "database=mineHash;user=minehash@mineservidor;password=Bandtec@2019;"
                    + "encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");

            // aqui definimos o driver do jdbc que estamos usando
            // conexao.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
            // aqui definimos qual a URL (caminho) da nossa base de dados. No caso, como é local,
            // puxamos a URL da nossa base do workbench :)
            //conexao.setUrl("jdbc:mysql://localhost:3306/teste_oshi?useTimezone=true&serverTimezone=UTC");
            // aqui definimos o nome de usuário relacionado a nossa database local
            //conexao.setUsername("root");
            // e por fim, definimos a senha para acesso da database
            // conexao.setPassword("Leo5767482200");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // aqui nós retornamos o valor da instância "conexao" que criamos lá em cima :)
        // tudo isso dentro do montarConexao() 
        return conexao;
    }

    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao);
        return jdbcTemplate;
    }
}
