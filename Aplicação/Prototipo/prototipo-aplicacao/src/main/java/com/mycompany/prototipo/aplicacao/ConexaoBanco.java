package com.mycompany.prototipo.aplicacao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private BasicDataSource con = new BasicDataSource();

    public BasicDataSource getConnection() {

        try {
            con.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con.setUrl("jdbc:sqlserver://01191065.database.windows.net:1433;"
                    + "database=mineHash;user=fabi_canedo@01191065;password=Mavibifa2019;"
                    + "encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
            con.setUsername("fabi_canedo");
            con.setPassword("Mavibifa2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(con);
        return jdbcTemplate;
    }
}
