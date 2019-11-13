/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;
import java.util.List;


/**
 *
 * @author yuriu
 */
public class MineHashAlertBot {
    
    public static void main(String[] args) {
        String BOT_TOKEN = "";
        String BOT_USERNAME = "MineHash Alerts";
        Integer BOT_OWNERID = null;
        Long LAST_CHAT_ID;
        TelegramBot bot = new TelegramBot(BOT_TOKEN);
        
        GetUpdatesResponse updatesResponse;
        SendResponse sendResponse;
        BaseResponse baseResponse;
        
        Integer m = 0;
        
        while (true) {
            updatesResponse = bot.execute(new GetUpdates().limit(100).offset(m));
            
            List<Update> updates = updatesResponse.updates();
            
            for (Update update : updates) {
                m = update.updateId()+1;
                LAST_CHAT_ID = update.message().chat().id();
                
                System.out.println(LAST_CHAT_ID.toString());
                System.out.println(
                        "Recebendo Mensagem: " +
                        update.message().text()
                );
                
                baseResponse = bot.execute(
                        new SendChatAction(
                                update.message().chat().id(),
                                ChatAction.typing.name()
                        )
                );
                
                System.out.println(
                        "Resposta de Chat Action Enviada? " +
                        baseResponse.isOk()
                );
                
                sendResponse = bot.execute(
                        new SendMessage(
                                update.message().chat().id(),
                                "A"
                        )
                );
            }
        }
    }
    
}
