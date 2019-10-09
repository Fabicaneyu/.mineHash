
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
    String disco;

    
        
        public String processador() {

        processador = hardware.getProcessor().getName();
        return processador;

    }
        public String memoriaTotal(){
            memoriaTotal = FormatUtil.formatBytes(hardware.getMemory().getTotal());
            return memoriaTotal;
            
        }
        
        
        
    
    
    
    
    
    
    
    
}
