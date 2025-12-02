# Java Date & Time Exercises — Algorithms, Pseudocode & Flowcharts

## Exercises

### Exercise 1 — Current LocalDate
### Question: Create a LocalDate of the current day and print it out

### Algorithm

- Access the system’s current date.

- Store it in a `LocalDate` variable.

- Print the date.

### Pseudocode
```pgsql
Start

Date ← LocalDate.now()

Print(date)

End
```

### Flowchart 

```mermaid
flowchart TD
    A[Start] --> B[Get LocalDate.now]
    B --> C[Print date]
    C --> D[End]
```


### Exercise 2 — Current Date with Formatter

### Question:  
Create a LocalDate of the current day and print it out in the following pattern using
DateTimeFormatter: Torsdag 29 mars

### Algorithm

- Get today’s LocalDate.

- Create a DateTimeFormatter with pattern "EEEE d MMMM".

- Format the date.

- Print the formatted value.

### Pseudocode
```pgsql
Start
Date ← LocalDate.now()
Formatter ← DateTimeFormatter ("EEEE d MMMM")
Formatted ← date.format(formatter)
Print(formatted)
End
```

### Flowchart
```mermaid
flowchart TD
    A[Start] --> B[Get LocalDate.now]
    B --> C[Create formatter]
    C --> D[Format date]
    D --> E[Print formatted date]
    E --> F[End]
```

### Exercise 3 — Last Monday + Print Entire Week

### Question: 
Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
format.

### Algorithm
  
- Get today’s date.

- Adjust to previous or same Monday.

- Loop 7 times:

- Print the date in ISO format.

- Move to next day.

### Pseudocode

```pgsql
Start 
Today ← LocalDate.now()
Monday ← today.with(previousOrSame(MONDAY))

for i from 0 to 6:
    print(monday.plusDays(i))
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Get today]
    B --> C[Find last Monday]
    C --> D[Loop 7 days]
    D --> E[Print day in ISO]
    E --> D
    D --> F[End]
```
### Exercise 4 — LocalDate.parse()

### Question: 
Create a LocalDate object from a String by using the .parse() method 

### Algorithm

- Create a date string.

- Convert to LocalDate using .parse().

- Print the result.

### Pseudocode
```pgsql
Start
DateString ← "2020-05-10"
Date ← LocalDate.parse(dateString)
Print(date)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Read date string]
    B --> C[Parse with LocalDate.parse]
    C --> D[Print date]
    D --> E[End]
```

### Exercise 5 — Birthday → Day of Week

### Question: 
The date time api provides enums for time units such as day and month.
Create a LocalDate of your birthday and extract the day of week for that date.
Ex. 1945-05-08 -> TUESDAY

### Algorithm

- Create LocalDate of birth.

- Extract day of week.

- Print it.

### Pseudocode

```pgsql
Start
Birthday ← LocalDate.of(YYYY, MM, DD)
Day ← birthday.getDayOfWeek()
Print(day)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Create birthday LocalDate]
    B --> C[Get day of week]
    C --> D[Print day]
    D --> E[End]
```

### Exercise 6 — Date +10 years –10 months

### Question: 
Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
month and print it out

### Algorithm

- Get current date.

- Add 10 years.

- Subtract 10 months.

- Extract month.

- Print month.

### Pseudocode

```pgsql
Start
Date ← LocalDate.now()
NewDate ← date.plusYears(10).minusMonths(10)
Month ← newDate.getMonth()
Print(month)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Get today]
    B --> C[Add 10 years]
    C --> D[Subtract 10 months]
    D --> E[Extract month]
    E --> F[Print month]
    F --> G[End]
```

### Exercise 7 — Period Between Birthday & Date from Ex6

### Question: 
Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
the date from exercise 5. Print out the elapsed years, months and days.

### Algorithm

-  Use birthday date.

- Use modified date from exercise 6.

- Create Period between the two.

- Print years, months, days.

### Pseudocode

```pgsql
Start
Period ← Period.between(birthday, newDate)
Print(period.years, period.months, period.days)
End
```

### Flowchart

```mermaid
flowchart TD

    A[Start] --> B[Get birthday]
    B --> C[Get modified date]
    C --> D[Create Period]
    D --> E[Print Y/M/D]
    E --> F[End]
```

### Exercise 8 — Add Custom Period

### Question: 
Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
the period you created to the current dat

### Algorithm

- Create Period (4y, 7m, 29d).

- Get current date.

- Add period to current date.

- Print result.

### Pseudocode

```pgsql
Start
P ← Period.of(4, 7, 29)
Now ← LocalDate.now()
Result ← now.plus(p)
Print(result)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Create Period]
    B --> C[Get current date]
    C --> D[Add period]
    D --> E[Print result]
    E --> F[End]
````

### Exercise 9 — Current LocalTime

### Question: 
Create a LocalTime object of the current time

### Algorithm

- Call LocalTime.now().

- Print the result.

### Pseudocode
```pgsql
Start
Time ← LocalTime.now()
Print(time)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Get LocalTime.now]
    B --> C[Print time]
    C --> D[End]
```
Exercise 10 — Extract Nanoseconds

### Question: 
Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds
### Algorithm

- Get current LocalTime.

- Extract nanoseconds.

- Print it.

### Pseudocode

```pgsql
Start
Time ← LocalTime.now
Nanos ← time.getNano
Print(nanos)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Get LocalTime.now]
    B --> C[Extract nano]
    C --> D[Print nano]
    D --> E[End]
```

### Exercise 11 — Parse LocalTime

### Question: 
Create a LocalTime object from a String using the .parse() method

### Algorithm

- Create a time string.

- Parse using LocalTime.parse().

- Print time.

### Pseudocode

```pgsql
Start
TimeString ← "15:20"
Time ← LocalTime.parse(timeString)
Print(time)
End
```

### Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Read time string]
    B --> C[Parse LocalTime]
    C --> D[Print time]
    D --> E[End]
```
