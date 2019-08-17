package com.can.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.can.dependencyinjection.business_layer.CoffeeMakerWithManuelDI;
import com.can.dependencyinjection.business_layer.CoffeeMakerWithoutDI;
import com.can.dependencyinjection.data.Coffee;
import com.can.dependencyinjection.data.Heater;
import com.can.dependencyinjection.data.Pump;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getCoffee(){

        /*Without Dependency Injection */
        Coffee coffee=new CoffeeMakerWithoutDI().makeCoffee();
    }

    public void getCoffee(Heater heater, Pump pump){

        /*With Manuel Dependency Injection */
        Coffee coffee=new CoffeeMakerWithManuelDI(heater,pump).makeCoffee();
    }


}
