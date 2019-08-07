package com.app.rc.gswspringbootmicroservice.app.ws.shared.utils;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomPlainTextKeyGenerator {

    private final static String SEQUENCE = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final static Integer LENGTH = 32;

    private final static Random RANDOM = new SecureRandom ( );

    /**
     * @return
     */
    public static String getString ( )
    {
        return generateRandomPlainTextKey (
                LENGTH );
    }

    /**
     * @param length
     * @return
     */
    public static String getString (
            int length )
    {
        return generateRandomPlainTextKey (
                length );
    }

    /**
     * @param length
     * @return
     */
    private static String generateRandomPlainTextKey (
            int length )
    {
        StringBuilder builder = new StringBuilder ( );
        for ( int i = 0; i < length; i++ ) {

            builder.append (
                    SEQUENCE.charAt (
                            RANDOM.nextInt (
                                    SEQUENCE.length ( ) ) ) );
        }
        return builder.toString ( );
    }
}
