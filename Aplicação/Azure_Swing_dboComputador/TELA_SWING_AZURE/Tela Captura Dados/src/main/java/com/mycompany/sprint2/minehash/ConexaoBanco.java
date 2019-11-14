package com.mycompany.sprint2.minehash;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class ConexaoBanco {
     private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource getConnection() {

        try {
            conexao.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexao.setUrl("jdbc:sqlserver://mineservidor.database.windows.net:1433;"
                    + "database=minehash;user=minehash@mineservidor;password=Bandtec@2019;"
                    + "encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
            
        // dentro de catch (pegar) vc trata a exceção de modo genérico:
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }

    // criar o construtor template e instanciar para o objeto conexao
    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao);
        return jdbcTemplate;
    }
}
