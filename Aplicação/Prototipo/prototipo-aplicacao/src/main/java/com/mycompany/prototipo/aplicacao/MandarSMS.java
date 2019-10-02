/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

import com.twilio.Twilio;
//import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

//import java.net.URI;
//import java.math.BigDecimal;
public class MandarSMS {

    PrototipoAplicacao envRelatorio = new PrototipoAplicacao();

    public static final String ACCOUNT_SID = "AC5e0e8b7e2338d814b71e30e5865c8f89";
    public static final String AUTH_TOKEN = "7be2acb0d707e69352bcd23d6480a56d";

    public void enviarSMS() {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+5511959358729"), new PhoneNumber("+12029198974"),
                        "Olá, Leonardo. Aqui está seu relatório: "
                        + "\nHostname: " + envRelatorio.hostname()
                        + "\nFabricante: " + envRelatorio.fabricante()
                        + "\nModelo: " + envRelatorio.modelo()
                        + "\nProcessador: " + envRelatorio.processador()
                        + "\nMemóriaTotal: " + envRelatorio.memoriaTotal()
                        + "\nMemóriaDisp: " + envRelatorio.memoriaDisp()
                        + "\nSistema: " + envRelatorio.sistemaOperacional()
                        ).create();

        System.out.println(message.getSid());

//        System.out.println(teste.Fabricante());
//        System.out.println(teste.Modelo());
//        System.out.println(teste.Processador());
//        System.out.println(teste.MemoriaTotal());
//        System.out.println(teste.MemoriaDisp());
    }

}
