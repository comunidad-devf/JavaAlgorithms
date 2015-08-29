import java.util.Scanner;
public class Compare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");
        int a = sc.nextInt();
        System.out.println("Give me one more number");
        int b = sc.nextInt();
        if (a > b)
        {
            System.out.println(a + " is grather than " + b);
        }
        else if (b > a)
        {
            System.out.println(b + " is grather than " + a);
        }
        else
        {
            System.out.println(a + " and " + b + " are equal.");
        }
    }
}