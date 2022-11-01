package org.example;

import java.util.Scanner;

public class LeapYear {

    private boolean leap;

    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return leap;
    }

    public int getYear() {
        return year;
    }

    public void calculateLeapYear(){
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
    }

    /*public static void main(String[] args) {

        boolean leap = false;

        Scanner u = new Scanner(System.in);
        System.out.print("Insert Year : ");
        Double year = u.nextDouble();
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
                else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }*/
}
