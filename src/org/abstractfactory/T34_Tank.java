package org.abstractfactory;

public class T34_Tank extends Tank {
    private static final String NAME = "T-34";
    private static final String COUNTRY = "Russia";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}