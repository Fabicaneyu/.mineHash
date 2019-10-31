package com.mycompany.prototipo.aplicacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;

/**
 *
 * @author ligimenes
 */
public class MatarProcessos extends Processos {

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        MatarProcessos teste = new MatarProcessos();
//        teste.puxarProcesso();
//        
//        Scanner leitor = new Scanner(System.in);
//
//        System.out.println("Qual o PID do processo que deseja matar?");
//        String inputProcId = leitor.nextLine();
//        teste.kill(inputProcId + ".exe");
//
//    }
//    public void puxarProcesso() {
//
//        for (int i = 0; i < 10; i++) {
//
//            procs = listaProcessos.get(i);
//            idProcesso = procs.getProcessID();
//            nomeProcesso = procs.getName();
//            prioridadeProcesso = procs.getPriority();
//
//            System.out.println(idProcesso);
//            System.out.println(nomeProcesso);
//            System.out.println(prioridadeProcesso);
//            System.out.println("");
//
//        }
//
//    }

    public static boolean kill(String processo) {
        try {
            String line;
            Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (!line.trim().equals("")) {
                    if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
                        Runtime.getRuntime().exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
                        return true;
                    }
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return false;
    }

}
