package com.company;

public class Main {

        public static double totalWages(double hours, double rate)
        {
            double wages;
            if (hours > 40)
            {
                wages = 1.5*(hours - 40)*rate + 40*rate;
            }
            else
            {
                wages = hours*rate;
            }
            return wages;
        }

        public static boolean isLeapYear (int year){
            if (year%4==0 && (year%100!=0 || year%400==0) )
            {
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean isLater(int month, int day1, int year1, int month2, int day2, int year2)
        {

        }

}
