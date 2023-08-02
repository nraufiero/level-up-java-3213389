package com.linkedin.javacodechallenges;
import java.time.LocalDate;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now
    public static LocalDate get100Days(LocalDate today){
        return today.plusDays(100);
    }

    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now();
        System.out.println("100 days from now is... " + get100Days(today));
    }
}
