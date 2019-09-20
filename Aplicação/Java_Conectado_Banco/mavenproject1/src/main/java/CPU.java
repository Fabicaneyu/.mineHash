/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ligimenes
 */
public class CPU {
    // alterar os atributos e os métodos(insert, update, etc) de acordo com o banco
    private String nome = "teste";
    private String sobrenome = "teste";

    public void EnviarBanco() {
        ConexaoBDFuncional insert = new ConexaoBDFuncional();
        insert.getConnection();
        insert.template().update(
                "insert into tb_teste (nome,sobrenome) "
                        + "values (?,?)", nome, sobrenome);
    }
    
    public void DeletarBanco() {
        ConexaoBDFuncional delete = new ConexaoBDFuncional();
        delete.getConnection();
        delete.template().update("delete from tb_teste where id_teste = 2");    
        
    }
    
    public void ModificarBanco() {
        ConexaoBDFuncional update = new ConexaoBDFuncional();
        update.getConnection();
        update.template().update("update tb_teste set nome = 'mineHash' where id_teste = 3");
        
    }
   
        

}
