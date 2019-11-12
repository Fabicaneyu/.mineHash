package com.mycompany.prototipo.aplicacao;

import java.util.Arrays;
import java.util.List;
import oshi.hardware.GlobalMemory;
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
    String usuario;
    String estadoProcesso;
    String cpuPercentual;
    Double memoriaPercentual;
    GlobalMemory memoria;

    ConexaoBanco conexaoBanco = new ConexaoBanco();

    public Processos() {

        listaProcessos = Arrays.asList(os.getProcesses(10, OperatingSystem.ProcessSort.CPU));

    }

    public static void main(String[] args) {

        Processos teste = new Processos();
        teste.enviarProcessosBanco();

    }

    public void enviarProcessosBanco() {

//        conexaoBanco.montarConexao();
        
        for (int i = 0; i < 10; i++) {

            procs = listaProcessos.get(i);
            usuario = procs.getUser();
            idProcesso = procs.getProcessID();
            nomeProcesso = procs.getName();
            prioridadeProcesso = procs.getPriority();
            estadoProcesso = procs.getState().name();
            cpuPercentual = String.format("%.2f", procs.calculateCpuPercent());
//          memoriaPercentual = 100d * Double.valueOf(procs.getResidentSetSize()) / Double.valueOf(memoria.getTotal());

            System.out.println(usuario);
            System.out.println(idProcesso);
            System.out.println(nomeProcesso);
            System.out.println(prioridadeProcesso);
            System.out.println(estadoProcesso);
            System.out.println(cpuPercentual + "%");
            System.out.println("-------------");

//            conexaoBanco.template().update(
//                    "insert into [dbo].[Processo] (PID, NomeProcesso, prioridade) values (?,?,?)",
//                    idProcesso, nomeProcesso, prioridadeProcesso
//            );
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
