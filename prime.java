package CONDITIONAL;

import java.util.Scanner;
public class prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();

       boolean isPrime= true;
       int count = 2;
       for(int i = 2; i <= Math.sqrt(num);i++)
       {
           if(num % i == 0)
           {
               isPrime = false;
           }
       }
       if(!isPrime)
       {
           System.out.println(num +" is not CONDITIONAL.prime.");
       }
       else
       {
           System.out.println(num +" is CONDITIONAL.prime.");
       }

    }
}
