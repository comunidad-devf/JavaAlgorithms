import java.util.Scanner;
public class ReadingInput2{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter an integer");
        int x = reader.nextInt();

        System.out.println("Enter a double");
        double y = reader.nextDouble();
        reader.nextLine();

        System.out.println("Enter a text");
        String s = reader.nextLine();


        System.out.println("Your text was: "+s);
        System.out.println("Your double was: "+y);
        System.out.println("Your integer was: "+x);
    }
}