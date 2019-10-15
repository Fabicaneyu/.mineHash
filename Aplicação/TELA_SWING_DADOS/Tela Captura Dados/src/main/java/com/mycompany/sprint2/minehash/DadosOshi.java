package com.mycompany.sprint2.minehash;

import oshi.SystemInfo;
import oshi.hardware.*;
//import oshi.software.os.*;
import oshi.util.FormatUtil;

public class DadosOshi {

    SystemInfo sistema = new SystemInfo();
    HardwareAbstractionLayer hardware = sistema.getHardware();
//    OperatingSystem sistemaOperacional = sistema.getOperatingSystem();

    String processador;
    String memoriaTotal;
    String fabricante;

    public DadosOshi() {
        processador = hardware.getProcessor().getName();
        memoriaTotal = FormatUtil.formatBytes(hardware.getMemory().getTotal());
        fabricante = hardware.getComputerSystem().getManufacturer();

    }
    
    

//        public String disco() {
//            disco = hardware;
//        return disco;
//        }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaTotal() {
        return memoriaTotal;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    
}
