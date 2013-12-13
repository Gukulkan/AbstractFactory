package org.abstractfactory;

public class RussianEngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new T34_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new Il2_Aircraft();
    }
}