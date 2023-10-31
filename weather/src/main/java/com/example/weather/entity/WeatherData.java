package com.example.weather.entity;

public class WeatherData {
    private String city;
    private String weather;
    private int temperature;
    private String wind;

    public WeatherData(String city, String weather, int temperature, String wind) {
        this.city = city;
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
