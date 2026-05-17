import java.util.ArrayList;
import java.util.Scanner;

public class even {

    static ArrayList<Integer> removeEven(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {

            if (num % 2 != 0) {
                list.add(num);
            }
        }

        return list;
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

        ArrayList<Integer> result = removeEven(arr);

        System.out.println(result);

        sc.close();
    }
}