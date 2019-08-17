package com.can.dependencyinjection.business_layer;

import com.can.dependencyinjection.data.Coffee;
import com.can.dependencyinjection.data.Heater;
import com.can.dependencyinjection.data.Pump;

public class CoffeeMakerWithManuelDI {

    private final Heater heater;
    private final Pump pump;

    public CoffeeMakerWithManuelDI(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    //Make coffee stuff below function
    public Coffee makeCoffee(){
        return null;
    }

}
