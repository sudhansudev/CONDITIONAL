package CONDITIONAL;

import java.util.Scanner;
public class switch_class
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the day:");
        int dayNum = sc.nextInt();
        String day = "";
        switch(dayNum)
        {
            default :
            day = "invalid input";
            break;
            case 1 : day = "Monday";
            break;
            case 2 : day = "Tuesday";
            break;
            case 3 : day = "Wednesday";
            break;
            case 4 : day = "Thursday";
            break;
            case 5 : day = "Friday";
            break;
            case 6 : day = "Saturday";
            break;
            case 7 : day = "Sunday";
            break;

        }
        System.out.println(day);

    }
}
