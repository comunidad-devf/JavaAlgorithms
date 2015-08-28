import java.util.Scanner;
public class NLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many adittions you want to make?...");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Try #" + (i+1) + " | Enter 3 integers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
        }
    }
}