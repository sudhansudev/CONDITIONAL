package CONDITIONAL;

import java.util.Scanner;
public class ShopDiscount
{
    public static void main(String[] args)
    {
        Scanner amt = new Scanner(System.in);
        System.out.print("enter the amount : ");
        int amount = amt.nextInt();
        double discount = 0;
        if(amount > 0 && amount <= 5000)
        {
            //System.out.println("NO DISCOUNT.");
            discount = 0;
        }
        else if(amount >= 5001 && amount <= 7000)
        {
            //System.out.println("5 % DISCOUNT.");
            discount = 0.05;
        }
        else if(amount >= 7001 && amount <= 9000)
        {
            //System.out.println("10 % DISCOUNT.");
            discount = 0.1;
        }
        else if(amount >= 9000)
        {
            //System.out.println("20 % DISCOUNT.");
            discount = 0.2;
        }
        else
        {
            //System.out.println("NO DISCOUNT FURTHER.");
        }
        double discountAmt = amount * discount;
        double bill = amount  - discountAmt;
        System.out.println(bill);
    }
}
