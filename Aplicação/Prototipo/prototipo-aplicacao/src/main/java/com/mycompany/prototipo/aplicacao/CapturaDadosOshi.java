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

public class CapturaDadosOshi {

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

    public CapturaDadosOshi() {

        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        memoriaTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        memoriaDisp = FormatUtil.formatBytes(hal.getMemory().getAvailable());
        sistemaOperacional = si.getOperatingSystem().getFamily();

    }

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
