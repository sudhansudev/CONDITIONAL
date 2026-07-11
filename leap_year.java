package CONDITIONAL;

import java.util.Scanner;
public class leap_year
{
    public static void main(String[] args)
    {
        System.out.print("enter the year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

//        boolean isleap = false;
//        if(year % 400 == 0) {
//            isleap = true;//century years divisible by 400 is a leap year
//        }
//        else if(year % 100 == 0)
//        {
//            isleap = false;//other century years are not leap years
//        }
//        else if(year % 4 == 0)
//        {
//            isleap = true;
//        }
//        else
//        {
//            isleap = false; //not divisible by 4
//        }
//
//        if(isleap)
//        {
//            System.out.println(year + " is a leap year.");
//        }
//        else
//        {
//            System.out.println(year + " is not a leap year.");
//        }
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year +" leap year.");
        }
        else
            System.out.println(year +" not a leap year.");
    }
}
