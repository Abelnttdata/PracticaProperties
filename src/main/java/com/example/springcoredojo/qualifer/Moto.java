package com.example.springcoredojo.qualifer;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Vehiculo{

    @Override
    public int cantRuedas() {
        return 2;
    }
}
