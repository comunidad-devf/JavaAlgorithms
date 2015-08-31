import java.util.Scanner;
public class InfiniteAdditions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String answer;
		boolean keep = false;
		do
		{
			System.out.println("Give me two numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + " + " + b + " = " + (a+b));
			System.out.println("Do you want to continue adding numbers? [y/N]");
			answer = sc.next();
			if (answer.equals("y") || answer.equals("Y") )
			{
				keep = true;
				System.out.println("");
			}
			else
			{
				keep = false;
				System.out.println("Good bye!");
			}
		} while (keep);
	}
}
