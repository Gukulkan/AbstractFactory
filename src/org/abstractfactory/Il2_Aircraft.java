package org.abstractfactory;

public class Il2_Aircraft extends Aircraft {
    private static final String NAME = "Il-2";
    private static final String COUNTRY = "Russia";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}