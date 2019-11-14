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
    
    protected String gpu;
    protected String disco;
    protected String memoriaTotal;
    protected String processador;
    protected String so;
    protected String hostname;
    protected String modelo;
    protected String fabricante;

    public DadosOshi() {
        this.gpu = hardware.getDisplays().toString();
        this.disco = FormatUtil.formatBytes(hardware.getDiskStores().length);
        this.memoriaTotal = FormatUtil.formatBytes(hardware.getMemory().getTotal());
        this.processador = hardware.getProcessor().getName();
        this.so = sistema.getOperatingSystem().getVersion().toString();
        this.hostname = sistemaOperacional.getNetworkParams().getHostName();
        this.modelo = hardware.getComputerSystem().getModel();       
        this.fabricante = hardware.getComputerSystem().getManufacturer();

    }  

    public SystemInfo getSistema() {
        return sistema;
    }

    public HardwareAbstractionLayer getHardware() {
        return hardware;
    }

    public OperatingSystem getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getGpu() {
        return gpu;
    }

    public String getDisco() {
        return disco;
    }

    public String getMemoriaTotal() {
        return memoriaTotal;
    }

    public String getProcessador() {
        return processador;
    }

    public String getSo() {
        return so;
    }

    public String getHostname() {
        return hostname;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    
}
