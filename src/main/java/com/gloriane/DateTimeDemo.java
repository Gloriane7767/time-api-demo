package com.gloriane;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        System.out.println("----Ex1----");
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time is: " + currentDateTime);

        LocalDate specificDate = LocalDate.of(2025, 12, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        System.out.println("Specific date is: " + specificDate.format(formatter));

        System.out.println("----Ex2-------");
        LocalTime specificTime = LocalTime.parse("15:30:00");
        System.out.println("Specific time is: " + specificTime);

        System.out.println("----Ex3-------");
        /*LocalDate.now() - Gets today's date
        .with(DayOfWeek.MONDAY) - Jumps to the Monday of this current week
        .minusWeeks(1) - Goes back 1 week to get last Monday
        The loop prints 5 consecutive days starting from last Monday
        If today is Sunday Dec 1, 2025:
        Current week's Monday = Nov 25, 2025
        Last Monday = Nov 18, 2025
        Loop prints: Nov 18, 19, 20, 21, 22 (Monday through Friday of last week)
        In simple terms: It finds last Monday's date, then shows you the 5 weekdays (Monday-Friday) of that week.
         */
        LocalDate lastmonday = LocalDate.now().with(DayOfWeek.MONDAY).minusWeeks(1);
        DateTimeFormatter iso = DateTimeFormatter.ISO_DATE;
        for(int i = 0; i < 7; i++) {
            LocalDate day = lastmonday.plusDays(i);
            System.out.println("Day: " + day.format(iso));
        }
        System.out.println("----Ex4-------");
        String dateText = "2025-12-01";
        System.out.println("Parsing date from text: " + dateText);

        System.out.println("----Ex5-------");
        LocalDate birthday = LocalDate.of(1977, 12, 11);
        DayOfWeek weekday = birthday.getDayOfWeek();
        System.out.println("December 11, 1977 was a: " + weekday);


    }
}