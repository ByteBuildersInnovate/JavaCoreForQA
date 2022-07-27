package homework7;

import homework7.enums.Functionality;
import homework7.enums.Periods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    WeatherProvider weatherProvider = new AccuWeatherProvider();
    Map<Integer, Functionality> varintResult = new HashMap();

    public Controller() {
        varintResult.put(1, Functionality.GET_CURRENT_WEATHER);
        varintResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        if (!varintResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (varintResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
        }
    }

    public void getCurrentWeather() throws IOException {
        weatherProvider.getWeather(Periods.NOW);
    }

    public void getWeatherIn5Days() throws IOException{
        weatherProvider.getWeather(Periods.FIVE_DAYS);
    }
}
