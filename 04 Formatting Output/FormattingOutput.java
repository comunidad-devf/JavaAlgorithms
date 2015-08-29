import java.util.Scanner;
public class FormattingOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me 3 lines");
        String line1 = scanner.nextLine();
        // System.out.println("Give me 2 more darling");
        String line2 = scanner.nextLine();
        // System.out.println("Just another one please :3");
        String line3 = scanner.nextLine();
        System.out.println("\n\n\n===========================================");
        System.out.println("\t" + line1);
        System.out.println("\t" + line2);
        System.out.println("\t" + line3);
        System.out.println("===========================================\n\n\n");
    }
}