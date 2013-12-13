package org.abstractfactory;

public class AmericanEngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new Mega_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new F12_Aircraft();
    }
}