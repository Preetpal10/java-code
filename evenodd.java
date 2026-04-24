import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int counteven = 0;
        int countodd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }

        System.out.println("Even count = " + counteven);
        System.out.println("Odd count = " + countodd);

        sc.close();
    }
}