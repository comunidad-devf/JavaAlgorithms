import java.util.Scanner;
public class InfiniteAdditions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r = 0;
		String sum_chain = r + " + ";
		String answer;
		boolean keep = false;
		do
		{
			System.out.println("Give a number");
			int a = sc.nextInt();
			r += a;
			sum_chain += a;
			System.out.println("Do you want to continue adding numbers? [y/N]");
			answer = sc.next();
			if (answer.equals("y") || answer.equals("Y") )
			{
				keep = true;
				sum_chain += " + ";
			}
			else
			{
				keep = false;
				System.out.println(sum_chain + " = " + r);
			}
		} while (keep);
	}
}
