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

 
   

}
