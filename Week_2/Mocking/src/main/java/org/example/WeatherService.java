package org.example;

public class WeatherService {
    private WeatherApiClient apiClient;
    public WeatherService(WeatherApiClient apiClient){
        this.apiClient=apiClient;
    }

    public String getweatherReport(String city){
        String weather=apiClient.getWeather(city);
        return "The weather in " + city + " is " + weather;
    }
}
