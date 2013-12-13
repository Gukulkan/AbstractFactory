package org.abstractfactory;

public class F12_Aircraft extends Aircraft {
    private static final String NAME = "F12";
    private static final String COUNTRY = "America";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}