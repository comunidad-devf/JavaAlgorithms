import java.util.Scanner;
public class SortingNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me an integer:");
        int a = sc.nextInt();
        System.out.println("Give me another integer:");
        int b = sc.nextInt();
        System.out.println("The las one please");
        int c = sc.nextInt();

        if (a > b)
        {
            if (b > c)
            {
                System.out.println(a + " > " + b + " > " + c);
            }
            else if (c > a)
            {
                System.out.println(c + " > " + a + " > " + b);
            }
            else
            {
                System.out.println(a + " > " + c + " > " + b);
            }
        }
        else
        {
            if (a > c)
            {
                System.out.println(b + " > " + a + " > " + c);
            }
            else if (c > b)
            {
                System.out.println(c + " > " + b + " > " + a);
            }
            else
            {
                System.out.println(b + " > " + c + " > " + a);
            }
        }
    }
}