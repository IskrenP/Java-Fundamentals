import java.util.Scanner;


public class Lekciq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printNxN(num1, num2, num3);

    }

    private static void printNxN(int num1, int num2, int num3) {
        int n = num1 + num2;
        int sum = n - num3;
        System.out.println(sum);

    }
}