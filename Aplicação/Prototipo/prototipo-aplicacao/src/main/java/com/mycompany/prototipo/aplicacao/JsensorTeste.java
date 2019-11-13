/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Gpu;
import com.profesorfalken.jsensors.model.sensors.Fan;
import com.profesorfalken.jsensors.model.sensors.Temperature;
import java.util.*;

/**
 *
 * @author gsramos
 */
public class JsensorTeste {
    
        public static void main(String[] args) {


        Map<String, String> overridenConfig = new HashMap<String, String>();
        overridenConfig.put("debugMode", "false");

        Components components = JSensors.get.config(overridenConfig).components();

        List<Cpu> gpus = components.cpus;
        if (gpus != null) {
            for (final Cpu gpu : gpus) {
                System.out.println("Found CPU component: " + gpu.name);
                if (gpu.sensors != null) {
                    System.out.println("Sensors: ");

                    //Print temperatures
                    List<Temperature> temps = gpu.sensors.temperatures;
                    for (final Temperature temp : temps) {
                        System.out.println(temp.name + ": " + temp.value + " C");
                    }

                    //Print fan speed
                    List<Fan> fans = gpu.sensors.fans;
                    for (final Fan fan : fans) {
                        System.out.println(fan.name + ": " + fan.value + " RPM");
                    }
                }
            }
        }
        
            System.out.println("Terminou");
            return ;
            

    }
}
