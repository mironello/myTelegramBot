package ua.org.tg;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class CurrentBot extends TelegramLongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "sdflskfsvbot";
    }

    @Override
    public String getBotToken(){
        return "6719098127:AAFPgA2ZnzMeVIaBRg1_c8uoY19PEKeAIXU";
    }
}