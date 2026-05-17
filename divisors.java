import java.util.*;

public class divisors {

    
    public static ArrayList<Integer> getDivisors(int n) {

        ArrayList<Integer> div = new ArrayList<>();

        
        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                div.add(i);

                
                if (i != n / i) {
                    div.add(n / i);
                }
            }
        }

        
        Collections.sort(div);

        return div;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ArrayList<Integer> result = getDivisors(n);

        System.out.println("Divisors are:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}