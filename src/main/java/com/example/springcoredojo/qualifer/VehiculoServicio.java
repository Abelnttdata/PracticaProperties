package com.example.springcoredojo.qualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class VehiculoServicio {
    @Autowired
    @Qualifier("moto")
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
