import java.util.*;

public class thief{

    
    public static int getMaxVal(List<Integer> arr, int k) {

    
        Collections.sort(arr, Collections.reverseOrder());

        int sum = 0;

        
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = getMaxVal(arr, k);

        System.out.println("Maximum stolen value = " + result);

        sc.close();
    }
}