package com.can.dependencyinjection.business_layer;

import com.can.dependencyinjection.data.Coffee;
import com.can.dependencyinjection.data.ElectricHeater;
import com.can.dependencyinjection.data.Heater;
import com.can.dependencyinjection.data.Pump;
import com.can.dependencyinjection.data.Thermosiphon;

public class CoffeeMakerWithoutDI {

    private final Heater heater;
    private final Pump pump;


    public CoffeeMakerWithoutDI() {
        this.heater=new ElectricHeater();
        this.pump=new Thermosiphon(this.heater);
    }

   public Coffee makeCoffee(){
        return null;
    }

}
