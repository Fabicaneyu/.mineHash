/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;

// não se esqueça de importar o necessário para usar o oshi :)
public class CapturaDadosOshi {

    // aqui é onde montamos nossos atributos que serão necessários para realizar
    // a captura de dados pertinentes ao projeto. Você pode adaptar a sua maneira
    // instância que "puxa" informações de sistema
    SystemInfo si = new SystemInfo();

    // instância que "puxa" informações de hardware
    HardwareAbstractionLayer hal = si.getHardware();

    // instância que "puxa" informações de Sistema Operacional
    OperatingSystem os = si.getOperatingSystem();

    // aqui estão nossos atributos que mais tarde daremos os devidos valores
    String hostname;
    String fabricante;
    String modelo;
    String processador;
    String memoriaTotal;
    String memoriaDisp;
    String sistemaOperacional;
    List<OSProcess> listaProcessos;
    OSProcess procs;
    int[] idProcesso = new int[10];
    String[] nomeProcesso = new String[10];
    int[] prioridadeProcesso = new int[10];

    public CapturaDadosOshi() {

        // aqui está o nosso construtor. Quando criarmos uma instância dessa 
        // classe, os atributos já terão esses valores "setados"
        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        memoriaTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        memoriaDisp = FormatUtil.formatBytes(hal.getMemory().getAvailable());
        sistemaOperacional = si.getOperatingSystem().getFamily();
        listaProcessos = Arrays.asList(os.getProcesses(10, OperatingSystem.ProcessSort.CPU));

        for (int i = 0; i < 10; i++) {
            procs = listaProcessos.get(i);
            idProcesso[i] = procs.getProcessID();
            nomeProcesso[i] = procs.getName();
            prioridadeProcesso[i] = procs.getPriority();

//            System.out.println(procs);
            System.out.println(idProcesso[i]);
            System.out.println(nomeProcesso[i]);
            System.out.println(prioridadeProcesso[i]);
//            procs.getUserTime();
//            procs.getKernelTime();
//            procs.getUpTime();

//            System.out.println("NAME: " + processos.getName());
//            System.out.println("PID: " + processos.getProcessID());
//            System.out.println("USER TIME: " + processos.getUserTime());
//            System.out.println("KERNEL TIME: " + processos.getKernelTime());
//            System.out.println("PRIORIDADE: " + processos.getPriority());
//            System.out.println("UP TIME: " + processos.getUpTime() + "\n\n");
        }
    }

    public static void main(String[] args) {
        CapturaDadosOshi teste = new CapturaDadosOshi();
        teste.getIdProcesso();
        teste.getNomeProcesso();
        teste.getPrioridadeProcesso();
    }

    // aqui estão os nossos "getters". Agora nós retornamos os valores dos atributos
    // após a execução dos métodos do oshi

    public String getHostname() {
        return hostname;
    }
    

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaTotal() {
        return memoriaTotal;
    }

    public String getMemoriaDisp() {
        return memoriaDisp;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

//    public Integer[] getIdProcesso() {
//        return idProcesso;
//    }
//
//    public String[] getNomeProcesso() {
//        return nomeProcesso;
//    }
//
//    public Integer[] getPrioridadeProcesso() {
//        return prioridadeProcesso;
//    }
    public int[] getIdProcesso() {
        return idProcesso;
    }

    public String[] getNomeProcesso() {
        return nomeProcesso;
    }

    public int[] getPrioridadeProcesso() {
        return prioridadeProcesso;
    }

}
