/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/**
 *
 * @author ligimenes
 */
public class SelectTeste {

    public static void main(String[] args) {
        // datasource de conexão com o Mysql

        ConexaoBDFuncional conectar = new ConexaoBDFuncional();
        conectar.getConnection();

//        
        //inserir, deletar e alterar são objetos da classe CPU pra chamar os métodos
        //que foram criados
        
        //dependendo do nosso projeto, talvez nós vamos criar mais métodos e chamar aqui
        
        CPU inserir = new CPU();
        inserir.EnviarBanco();// objeto 'inserir' executa o método EnviarBanco() que insere dados

        CPU deletar = new CPU();
        deletar.DeletarBanco();// objeto 'deletar' executa o método DeletarBanco() que deleta dados

        CPU alterar = new CPU();
        alterar.ModificarBanco();// objeto 'alterar' executa o método ModificarBanco que altera dados

        System.out.println(conectar.template().queryForList("select * from tb_teste"));
        // essa linha foi feita apenas pra exibir os dados da tabela após execução dos métodos
        
        
//        System.out.println(
//                jdbcTemplate.queryForList("select * from tb_teste")
//        );
    }
}
