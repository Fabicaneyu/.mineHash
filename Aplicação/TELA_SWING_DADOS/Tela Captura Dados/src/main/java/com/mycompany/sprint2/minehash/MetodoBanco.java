
package com.mycompany.sprint2.minehash;


public class MetodoBanco extends DadosOshi {
    
    
//    ConexaoBanco conexao = new ConexaoBanco();
//    
//    public void enviarBanco() {
//        conexao.getConnection();
//        conexao.template().update(
//                "insert into TesteOshi (PROCESSADOR,RAM,FABRICANTE) values (?,?,?)",
//                getProcessador(), getMemoriaTotal(), getFabricante());
//
//    }
    
    // Variáveis

    ConexaoBanco mhdb = new ConexaoBanco();

    // Insert Codes
    
    // tb_computador (para inserir apenas 1 vez
    public void insertComputador(
            Integer idMinerador, String disco, String ram, String so,
            String gpu, String hostname, String modelo, String processador
    ) {
      try {
        mhdb.getConnection();
        mhdb.template().update(
                "insert into tb_computador" +
                "(fk_minerador, nm_disco, nm_ram, nm_so, nm_gpu, nm_hostname " +
                ", nm_modelo, nm_processador) values (?, ?, ?, ?, ?, ?, ?, ?)",
                idMinerador, disco, ram, so, gpu, hostname, modelo, processador
        ).then(String (res) {
          System.out.println("Retorno: " + res);
      })
      }
    }
    
    // tb_desempenho
    public void insertDesempenho(
            Integer idComputador, Double consumoProcessador,
            Double consumoRAM, Double consumoArmazenamento,
            Double consumoGPU, Double temperatura
    ) {
      try {
        mhdb.getConnection();
        mhdb.template().update(
                "insert into tb_desempenho " +
                "(fk_computador, nu_processador, nu_ram, nu_disco, nu_gpu, " +
                "nu_temp) values (?, ?, ?, ?, ?, ?)",
                idComputador, consumoProcessador,
            consumoRAM, consumoArmazenamento,
            consumoGPU, temperatura
        ).then(String (res) {
          System.out.println("Retorno: " + res);
      })
      } catch(Exception e) {
        System.out.println("Erro na inserção de Desempenho: " + err);
      }
    }

    // tb_processo
    public void insertProcesso(
                Integer idDesempenho, Integer pid, String nomeProcesso) {
      try {
        mhdb.getConnection();
        mhdb.template().update(
                "insert into tb_processo (fk_desempenho, nu_pid, nm_processo) " +
                "values (?,?,?)", idDesempenho, pid, nomeProcesso
        ).then(String (res) {
          System.out.println("Retorno: " + res);
      })
      } catch(Exception err) {
        System.out.println("Erro na inserção de Processo: " + err);
      }
    }
    
    
}
