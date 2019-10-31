package com.mycompany.prototipo.aplicacao;

import java.util.Arrays;
import java.util.List;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author ligimenes
 */
public class Processos extends CapturaDadosOshi {

    List<OSProcess> listaProcessos;
    OSProcess procs;
    Integer idProcesso;
    String nomeProcesso;
    Integer prioridadeProcesso;

    ConexaoBanco conexaoBanco = new ConexaoBanco();

    public Processos() {

        listaProcessos = Arrays.asList(os.getProcesses(10, OperatingSystem.ProcessSort.CPU));

    }

    public void enviarProcessosBanco() {

        conexaoBanco.montarConexao();

        for (int i = 0; i < 10; i++) {

            procs = listaProcessos.get(i);
            idProcesso = procs.getProcessID();
            nomeProcesso = procs.getName();
            prioridadeProcesso = procs.getPriority();

            System.out.println(idProcesso);
            System.out.println(nomeProcesso);
            System.out.println(prioridadeProcesso);
            System.out.println("");

            conexaoBanco.template().update(
                    "insert into tb_processo (pid, nome_processo, prioridade) values (?,?,?)",
                    idProcesso, nomeProcesso, prioridadeProcesso
            );

        }

    }

    public void enviarProcessosSwing(int id[], String nome[], int prio[]) {

        conexaoBanco.montarConexao();

        for (int i = 0; i < 10; i++) {

            procs = listaProcessos.get(i);
            id[i] = procs.getProcessID();
            nome[i] = procs.getName();
            prio[i] = procs.getPriority();

//            System.out.println(idSwing[i]);
//            System.out.println(nomeSwing[i]);
//            System.out.println(prioridadeSwing[i]);
//            System.out.println("");
        }

    }

//    public Integer getIdProcesso() {
//        return idProcesso;
//    }
//
//    public Integer getPrioridadeProcesso() {
//        return prioridadeProcesso;
//    }
//
//    public String getNomeProcesso() {
//        return nomeProcesso;
//    }
//    public static void main(String[] args) {
//        Processos teste = new Processos();
//        teste.enviarProcessosSwing();
//        
//        System.out.println(Arrays.toString(teste.getNomeSwing()));
//        System.out.println(Arrays.toString(teste.getPrioridadeSwing()));
//        System.out.println(Arrays.toString(teste.getIdSwing()));
//        
//        System.out.println("");
//
//    }
}
