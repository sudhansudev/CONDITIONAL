package CONDITIONAL;

public class nested_if
{
    public static void main(String[] args)
    {
        int day = 4;
        String dayName = "";
//        switch(day)
//        {
//            case 1: System.out.println("Monday");
//            break;
//            case 2: System.out.println("Tuesday");
//            break;
//            case 3: System.out.println("Wednesday");
//            break;
//            case 4: System.out.println("Thursday");
//            break;
//            case 5: System.out.println("Friday");
//            break;
//            default: System.out.println("invalid input.");
//            break;
//        }
        if(day == 1)
        {
            dayName = "Monday";
        }
        else if(day == 2)
        {
            dayName = "Tuesday";
        }
        else if(day == 3)
        {
            dayName = "Wednesday";
        }
        else if(day == 4)
        {
            dayName = "Friday";
        }
        else
        {
            dayName = "invalid";
        }

        System.out.println(dayName);

    }
}
