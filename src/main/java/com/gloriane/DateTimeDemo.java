package com.gloriane;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time is: " + currentDateTime);
        
        LocalDate specificDate = LocalDate.of(2025, 12, 1);DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        System.out.println("Specific date is: " + specificDate.format(formatter));

        LocalTime specificTime = LocalTime.parse("15:30:00");
        System.out.println("Specific time is: " + specificTime);
    }
}