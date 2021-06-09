package ru.netology.domain;

public class Conditioner {
    boolean on;
    int maxTemperature = 40;
    int minTemperature = 10;
    int correntTemperature;

    void setMiddleTemp(){

    int targetTemp = (maxTemperature + minTemperature) / 2;
    correntTemperature = targetTemp;

}

    }




