import java.util.*;

public class ThirdLargest {

    public static int findThirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (num > second) {
                third = second;
                second = num;
            } 
            else if (num > third) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            return -1; 
        }

        return third;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

    
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findThirdLargest(arr);

        if (result == -1) {
            System.out.println("Third largest element not found (need 3 distinct numbers)");
        } else {
            System.out.println("Third largest element: " + result);
        }

        sc.close();
    }
}