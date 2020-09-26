package com.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DivisionTest {


    @Test
    public void testGetValues_V1() {
        int[] values = Division.getValues(1, 1);

        int expectedQuotient = 1;
        int expectedReminder = 0;
        assertEquals(expectedQuotient, values[0]);
        assertEquals(expectedReminder, values[1]);
    }

    @Test
    public void testZero() {
        int[] values = Division.getValues(1, 0);

        assertNull(values);
    }

    @Test
    public void testGetValues_V2() {
        int[] values = Division.getValues(3, 2);

        int expectedQuotient = 1;
        int expectedReminder = 1;
        assertEquals(expectedQuotient, values[0]);
        assertEquals(expectedReminder, values[1]);
    }

//    @Test
//    public void TestWithNegativeValues() {
//        int[] values = Division.getValues(-3, -1);
//
//        int expectedQuotient = 3;
//        int expectedReminder = 0;
//        assertEquals(expectedQuotient, values[0]);
//        assertEquals(expectedReminder, values[1]);
//    }
//
//    @Test
//    public void testGreaterThanZero() {
//        int[] values = Division.getValues(3, 1);
//
//        int expectedQuotient = 3;
//        int expectedReminder = 0;
//        assertEquals(expectedQuotient, values[0]);
//        assertEquals(expectedReminder, values[1]);
//    }
}
