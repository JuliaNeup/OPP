package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionerTest {
    @Test
    public void myTest (){
        Conditioner con = new Conditioner();
        con.minTemperature = 10;
        con.maxTemperature = 20;
        con.on = true;

          con.setMiddleTemp();
          
          int expected = (10 + 20) / 2;
          int actual = con.correntTemperature;
        assertEquals(expected , actual);

                  
    }
    }
