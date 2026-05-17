import java.util.*;

public class largestarraylist {

    
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {

        ArrayList<Integer> array = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {

            if (arr[i] >= k) {
                array.add(arr[i]);
            }
        }

        
        Collections.sort(array);

        return array;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        ArrayList<Integer> result = javaIterator(n, k, arr);

        System.out.println("Result ArrayList:");

        System.out.println(result);

        sc.close();
    }
}