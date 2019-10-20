package com.mycompany.sprint2.minehash;

import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;
import sun.security.util.HostnameChecker;

public class DadosOshi {

    SystemInfo sistema = new SystemInfo();
    HardwareAbstractionLayer hardware = sistema.getHardware();
    OperatingSystem sistemaOperacional = sistema.getOperatingSystem();
    //OperatingSystem hostname = sistema.getOperatingSystem();
    
    private String hostname;
    private String processador;
    private String memoriaTotal;
    private String disco;
    private String so;
    private String gpu;
    private String modelo;

    public DadosOshi() {
        this.hostname = sistema.getOperatingSystem().getFileSystem().toString();
        this.processador = hardware.getProcessor().getName();
        this.memoriaTotal = FormatUtil.formatBytes(hardware.getMemory().getTotal());
        this.disco = FormatUtil.formatBytes(hardware.getDiskStores().length);
        this.so = sistema.getOperatingSystem().getVersion().toString();
        this.gpu = hardware.getDisplays().toString();
        this.modelo = hardware.getComputerSystem().getManufacturer();

    }  

    public String getHostname() {
        return hostname;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaTotal() {
        return memoriaTotal;
    }

    public String getDisco() {
        return disco;
    }

    public String getSo() {
        return so;
    }

    public String getGpu() {
        return gpu;
    }

    public String getModelo() {
        return modelo;
    }
}
