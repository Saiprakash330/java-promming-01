import java.util.Scanner;
public class fibbo
{
    public static void main(String[] args) 
    {
     try
       { 
        int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
   if(n<=0)
     {
        System.out.println("Invalid");
     }
    else
    {
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
}
}
   catch(Exception e)
     {
   System.out.println("Invalid due to floating point");
       }
    }
}