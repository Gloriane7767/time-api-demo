package com.gloriane;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


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

        System.out.println("----Ex6-------");
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusYears(10).minusMonths(9);
        System.out.println("Date after adding 10 years and subtracting 9 months: " + futureDate);

        System.out.println("----Ex7-------");
        LocalDate targetDate = LocalDate.of(2035, 3, 1);//2035-03-01
        LocalDate birthdayDate = LocalDate.of(1977, 12, 11);//1977-12-11
        Period elapsed = Period.between(birthdayDate, targetDate);
        System.out.println("Time elapsed from December 11, 1977 to March 1, 2035: " +
                elapsed.getYears() + " years, " +
                elapsed.getMonths() + " months, " +
                elapsed.getDays() + " days.");

        System.out.println("----Ex8-------");
        Period customPeriod = Period.of(4, 7, 29);  // 4years, 7 months, 29 days
        LocalDate newDate = currentDate.plus(customPeriod);
        System.out.println("Date after adding custom period (4 years, 7 months, 29 days): " + newDate);

        System.out.println("----Ex9-------");
        LocalTime cTime = LocalTime.now();
        System.out.println("Current time: " + cTime);

        System.out.println("----Ex10-------");
        LocalTime currentTimeNano = LocalTime.now();
        int nanoseconds = currentTimeNano.getNano();
        System.out.println("Just the nanoseconds: " + nanoseconds);

        System.out.println("----Ex11-------");
        String TimeText = "22:51:03";
        LocalTime parsedTime = LocalTime.parse(TimeText);
        System.out.println("Parsed time from text: " + parsedTime);

        System.out.println("----Ex12-------");
        LocalTime time1 = LocalTime.of(23, 22, 17);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = time1.format(timeFormatter);
        System.out.println("Formatted time: " + formattedTime);

        System.out.println("----Ex13-------");
        LocalDateTime currentDT = LocalDateTime.now();
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("'date:' yyyy-MM-dd, 'time:' HH:mm:ss");
        String formattedDateTime = currentDT.format(dtFormatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        System.out.println("----Ex14-------");
        LocalDateTime specificDT = LocalDateTime.of(2025, 12, 1, 14, 30, 0);
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy 'at' hh:mm a");
        String customFormattedDT = specificDT.format(customFormatter);
        System.out.println("Custom formatted date and time: " + customFormattedDT);

        System.out.println("----Ex15-------");
        LocalDate dateA = LocalDate.of(2025, 12, 1);
        LocalTime timeA = LocalTime.of(10, 15, 30);
        LocalDateTime combinedDT = LocalDateTime.of(dateA, timeA);
        System.out.println("Combined date and time: " + combinedDT);

        System.out.println("----Ex16-------");
        LocalDateTime dt1 = LocalDateTime.of(2025, 12, 1, 10, 0, 0);
        LocalDate datePart = dt1.toLocalDate();
        LocalTime timePart = dt1.toLocalTime();
        System.out.println("Extracted date: " + datePart);
        System.out.println("Extracted time: " + timePart);

        System.out.println("----Ex17-------");
        Calender cal = new Calender();
        cal.displayYear(2026);
    }
}