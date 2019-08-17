package com.can.dependencyinjection.data;

public class Thermosiphon implements Pump{
    private Heater heater;
    @Override
    public void pump() {

    }
    public Thermosiphon(Heater heater) {
        this.heater=heater;
    }
}
