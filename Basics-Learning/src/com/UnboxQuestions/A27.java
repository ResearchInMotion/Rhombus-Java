package com.UnboxQuestions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

// Calculate age from date of birth in Java
// Works in all Java versions
public class A27 {

    public static void main(String[] args) throws Exception {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        System.out.println("Age is:" + getAge(dob));
    }

    // Returns age given the date of birth
    public static int getAge(Calendar dob) throws Exception {
        Calendar today = Calendar.getInstance();

        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);

        int age = curYear - dobYear;

        // if dob is month or day is behind today's month or day
        // reduce age by 1
        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) { // this year can't be counted!
            age--;
            System.out.println("This year can not be counted ");
        } else if (dobMonth == curMonth) { // same month? check for day
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) { // this year can't be counted!
                age--;
            }
        }

        return age;
    }
}
