package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calculateHundredDaysFromNow() {
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        assertEquals(LocalDate.of(2020, 4, 10), 
            App.get100Days(d1));
    }
}
