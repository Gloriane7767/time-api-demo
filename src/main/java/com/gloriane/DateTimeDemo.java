package com.gloriane;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time is: " + currentDateTime);

        

    }
}

