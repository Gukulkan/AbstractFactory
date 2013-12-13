package org.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        EngineryFactory engineryFactory = new RussianEngineryFactory();

        System.out.println("Russian enginery:");
        showEnginery(engineryFactory);
        
        System.out.println();

        System.out.println("American enginery:");
        engineryFactory = new AmericanEngineryFactory();
        showEnginery(engineryFactory);
    }
    
    public static void showEnginery(EngineryFactory engineryFactory) {
        Tank tank = engineryFactory.createTank();
        System.out.println(tank.getDescription());

        Aircraft aircraft = engineryFactory.createAircraft();
        System.out.println(aircraft.getDescription());
    }
}