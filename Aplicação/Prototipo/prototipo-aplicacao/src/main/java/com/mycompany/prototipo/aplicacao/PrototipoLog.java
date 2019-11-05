/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;


import java.util.logging.Level;
import java.util.logging.Logger;


class PrototipoLog {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    // Get the Logger from the log manager which corresponds  
    // to the given name <Logger.GLOBAL_LOGGER_NAME here> 
    // static so that it is linked to the class and not to 
    // a particular log instance because Log Manage is universal 
    public void makeSomeLog() {
        // add some code of your choice here 
        // Moving to the logging part now 
        LOGGER.log(Level.INFO, "My first Log Message");

        // A log of INFO level with the message "My First Log Message" 
    }
}

//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;
//import java.util.ArrayList;
//import java.util.List;
//public class PrototipoLog {
//    public static void main(String[] args) throws IOException {
//
//        File arquivo = new File("arquivo.txt");
//
//        if (!arquivo.exists()) {
//
//            arquivo.createNewFile();
//        }
//        List<String> lista = new ArrayList<>();
//        lista.add("Fazendo um log simples");
//        lista.add("Usuario: Joãozinho Fez uma alteração neste hora: "
//                + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
//
//        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
//
//    }

