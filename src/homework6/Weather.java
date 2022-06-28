package homework6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Weather {
    public static void main(String[] args) throws IOException {
// Экземпляр класса OkHttpClient выполняет всю работу по созданию и отправке запросов
        OkHttpClient client = new OkHttpClient();
// Экземпляр класса Request создается через Builder
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/alarms/v1/5day/452?apikey=FttqFnMLHElRZKF1UC7fqWVj7itKOJB7&language=ru")
                .build();
// Получение объекта ответа от сервера
        Response response = client.newCall(request).execute();
// Тело сообщения возвращается методом body объекта Response
        assert response.body() != null;
        String body = response.body().string();
        System.out.println(body);
        System.out.println(response.code());
        System.out.println(response.headers());
    }
}
