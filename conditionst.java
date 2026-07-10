package CONDITIONAL;

import java.util.Scanner;
public class conditionst
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter your favourite icecream :");
        String ice = sc.nextLine();

        if (ice.equalsIgnoreCase("chocolate"))
        {
            System.out.println("we got chocolate bro .");
        }
        if(ice.equalsIgnoreCase("banana"))
        {
            System.out.println("we got banana bro .");
        }
        else if(ice.equalsIgnoreCase("vanilla"))
        {
            System.out.println("we got vanilla bro .");
        }
        else if(ice.equalsIgnoreCase("butter-schoch"))
        {
            System.out.println("we got butter schoch bro .");
            System.out.println("this is the last ice-cream :) flavour we have to offer .");//out of the if and else block both.
        }
        else
        {
            System.out.println("sorry :( we dont have any other than these .");
        }
    }
}
