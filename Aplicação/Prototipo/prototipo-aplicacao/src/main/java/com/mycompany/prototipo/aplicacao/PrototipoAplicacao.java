/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;
//import com.profesorfalken.jsensors.model.components.Components;
//import com.profesorfalken.jsensors.model.components.Gpu;

public class PrototipoAplicacao {

    SystemInfo si = new SystemInfo();
    HardwareAbstractionLayer hal = si.getHardware();
    OperatingSystem os = si.getOperatingSystem();

    String hostname;
    String fabricante;
    String modelo;
    String processador;
    String memoriaTotal;
    String memoriaDisp;
    String sistemaOperacional;
    String processoCaminho;
    String nomeProcesso;

    public String hostname() {

        hostname = os.getNetworkParams().getHostName();
        return hostname;

    }

    public String fabricante() {

        fabricante = hal.getComputerSystem().getManufacturer();
        return fabricante;

    }

    public String modelo() {

        modelo = hal.getComputerSystem().getModel();
        return modelo;

    }

    public String processador() {

        processador = hal.getProcessor().getName();
        return processador;

    }

    public String memoriaTotal() {

        memoriaTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        return memoriaTotal;

    }

    public String memoriaDisp() {

        memoriaDisp = FormatUtil.formatBytes(hal.getMemory().getAvailable());
        return memoriaDisp;

    }

    public String sistemaOperacional() {

        sistemaOperacional = si.getOperatingSystem().getFamily();
        return sistemaOperacional;

    }

    public String caminhoProcesso() {
        
        processoCaminho = os.getProcess(452).getPath().toString();
        return processoCaminho;
        
    }
    
    public String nomeProcesso() {
        
        nomeProcesso = os.getProcess(452).getName().toString();
        return nomeProcesso;
        
    }
//    
//    public OperatingSystemVersion VersaoSistema() {
//
//        versaoSistema = si.getOperatingSystem().getVersion();
//        return versaoSistema;
//    }
}
