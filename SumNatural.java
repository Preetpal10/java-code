import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum of natural numbers: " + sum);

        sc.close();
    }
}
