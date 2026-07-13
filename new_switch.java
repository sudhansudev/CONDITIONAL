package CONDITIONAL;

import java.util.Scanner;
public class new_switch
{
    public static void main(String[] args)
    {
        //to check vowels with the help of switch case
        Scanner vowel = new Scanner(System.in);
        System.out.print("enter the vowel:");
        char ch = vowel.next().charAt(0);

//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//        {
//            System.out.println("Vowel.");
//        }
//        else
//        {
//            System.out.println("Consonant.");
//        }
        switch(ch)
        {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
//            case 'e' -> System.out.println("vowel");
//            case 'i' -> System.out.println("vowel");
//            case 'o' -> System.out.println("vowel");
//            case 'u' -> System.out.println("vowel");
            default -> System.out.println("Consosonant.");
        }
        
    }
}
