package com.example.springcoredojo.qualifer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Camion implements Vehiculo{
    @Override
    public int cantRuedas() {
        return 6;
    }
}
