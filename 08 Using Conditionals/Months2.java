import java.util.Scanner;
public class Months2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("I'd like a month number: ");
        int monthNumber = sc.nextInt();

        if (monthNumber == 1)
        {
            System.out.println("Your month is January");
        }
        else if (monthNumber == 2)
        {
            System.out.println("Your month is February");
        }
        else if (monthNumber == 3)
        {
            System.out.println("Your month is March");
        }
        else if (monthNumber == 4)
        {
            System.out.println("Your month is April");
        }
        else if (monthNumber == 5)
        {
            System.out.println("Your month is May");
        }
        else if (monthNumber == 6)
        {
            System.out.println("Your month is June");
        }
        else if (monthNumber == 7)
        {
            System.out.println("Your month is July");
        }
        else if (monthNumber == 8)
        {
            System.out.println("Your month is August");
        }
        else if (monthNumber == 9)
        {
            System.out.println("Your month is September");
        }
        else if (monthNumber == 10)
        {
            System.out.println("Your month is October");
        }
        else if (monthNumber == 11)
        {
            System.out.println("Your month is November");
        }
        else if (monthNumber == 12)
        {
            System.out.println("Your month is December");
        }
        else
        {
            System.out.println("That is not a valid month number");
        }
    }
}
