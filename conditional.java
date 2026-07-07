package CONDITIONAL;

public class conditional
{
    public static void main(String[] args)
    {
        String s = "tyson";
        String s1 = "sonu";
        char ch = 'A';

        // if() condition
        if(ch == 'A')
        {
          System.out.println("value is 65.");
        }
        else
        {
          System.out.println("nothing is right.");
        }

        if(s == "monu") {
            System.out.println("value is tyson.");
        }
        else if(s1 == "tyson")
        {
            System.out.println("value is sonu.");
        }
        else
        {
            System.out.println("noo value matched.");
        }
    }
}
