/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenlogin;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource getConnection() {

        try {
//            con.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//            con.setUrl("jdbc:sqlserver://01191065.database.windows.net:1433;"
//                    + "database=mineHash;user=fabi_canedo@01191065;password=Mavibifa2019;"
//                    + "encrypt=true;trustServerCertificate=false;"
//                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");


//            conexao.setDriverClassName("com.mysql.cj.jdbc.Driver");
//            conexao.setUrl("jdbc:mysql://localhost:3306/mineLogin?useTimezone=true&serverTimezone=UTC");
//            conexao.setUsername("root");
//            conexao.setPassword("210735Nm");


            conexao.setDriverClassName("com.mysql.cj.jdbc.Driver");
            conexao.setUrl("jdbc:mysql://127.0.0.1:3306/teste_oshi?useTimezone=true&serverTimezone=UTC");
            conexao.setUsername("root");
            conexao.setPassword("Leo5767482200");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexao;
    }

    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao);
        return jdbcTemplate;
    }
}
