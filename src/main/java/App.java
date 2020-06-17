import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

public class App {
    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ApiContextInitializer.init();
        Bot weatherBot = new Bot("BasuhaWeatherBot", "1116341710:AAFVJTdy1NuG2rFg9N28HeBqpU-pO7-E5ts");
        weatherBot.botConnect();
    }
}
