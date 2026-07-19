package CONDITIONAL;

public class ternary
{
    public static void main(String[] args)
    {
        int num = 29;
        int c = 0;
        for(int i = 1; i<= Math.sqrt(num);i++)
        {
            if(num % i == 0) {
                c++;
            }
        }

         String ans = c == 2 ? "CONDITIONAL.prime." : "not CONDITIONAL.prime.";
        System.out.println(ans);

    }
}
