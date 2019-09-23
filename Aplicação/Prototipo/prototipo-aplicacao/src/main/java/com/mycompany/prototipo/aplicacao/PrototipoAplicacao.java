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

public class PrototipoAplicacao {

    SystemInfo si = new SystemInfo();
    HardwareAbstractionLayer hal = si.getHardware();
    OperatingSystem os = si.getOperatingSystem();

    String fabricante;
    String modelo;
    String processador;
    String memoriaTotal;
    String memoriaDisp;

    public String Fabricante() {
        fabricante = hal.getComputerSystem().getManufacturer();
      
        return fabricante;

    }

    public String Modelo() {
        modelo = hal.getComputerSystem().getModel();
        return modelo;
    }

    public String Processador() {
        processador = hal.getProcessor().getName();
        return processador;

    }

    public String MemoriaTotal() {
        memoriaTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        return memoriaTotal;

    }
    
     public String MemoriaDisp() {
        memoriaDisp = FormatUtil.formatBytes(hal.getMemory().getAvailable());
        return memoriaDisp;

    }
}
