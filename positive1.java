import java.util.Scanner;

public class positive1 {

    static int countPositive(int arr[]) {

        int count = 0;

        for (int num : arr) {

            if (num > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Positive Numbers = " + countPositive(arr));

        sc.close();
    }
}