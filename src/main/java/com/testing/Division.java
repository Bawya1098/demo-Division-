package com.testing;

public class Division {

    public static int[] getValues(int value1, int value2) {
        if (value2 == 0) {
            return null;
        }
        int quotient = value1 / value2;
        int reminder = value1 % value2;

        return new int[]{quotient, reminder};

    }


}
