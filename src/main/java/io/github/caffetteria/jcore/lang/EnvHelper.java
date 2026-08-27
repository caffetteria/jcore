package io.github.caffetteria.jcore.lang;

public class EnvHelper {

    private EnvHelper() {}

    public static String getP( String systemPropertyKey ) {
        return System.getProperty( systemPropertyKey );
    }

    public static String getE( String systemPropertyKey ) {
        return System.getenv( systemPropertyKey );
    }

}
