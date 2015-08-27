import java.util.Scanner;
public class ReadingInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write 3 integers");
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        System.out.println("Your first integer was "+ a);
        System.out.println("Your second integer was "+ b);
        System.out.println("Your third integer was "+ c);
    }
}