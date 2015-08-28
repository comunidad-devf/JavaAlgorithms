import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the value for \"a\":");
        double a = sc.nextDouble();
        System.out.println("Give me the value for \"b\":");
        double b = sc.nextDouble();
        System.out.println("Give me the value for \"c\":");
        double c = sc.nextDouble();
        double r1 = ((-b) + (Math.sqrt((b*b) - (4*a*c)))) / (2*a);
        double r2 = ((-b) - (Math.sqrt((b*b) - (4*a*c)))) / (2*a);
        System.out.println("Result 1 = " + r1);
        System.out.println("Result 2 = " + r2);
    }
}