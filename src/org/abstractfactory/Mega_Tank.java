package org.abstractfactory;

public class Mega_Tank extends Tank {
    private static final String NAME = "Mega";
    private static final String COUNTRY = "America";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }
}
