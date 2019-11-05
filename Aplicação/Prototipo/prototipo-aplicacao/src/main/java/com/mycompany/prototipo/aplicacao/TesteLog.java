/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TesteLog { 
    public static void main(String[] args) 
    { 
        PrototipoLog obj = new PrototipoLog(); 
        obj.makeSomeLog(); 
  
        // Generating some log messages through the  
        // function defined above 
        LogManager lgmngr = LogManager.getLogManager(); 
  
        // lgmngr now contains a reference to the log manager. 
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 
  
        // Getting the global application level logger  
        // from the Java Log Manager 
        log.log(Level.INFO, "This is a log message"); 
  
        // Create a log message to be displayed 
        // The message has a level of Info 
    } 
}
