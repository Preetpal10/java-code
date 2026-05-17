import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.reverse(list);

        System.out.println("Reversed List:");
        System.out.println(list);

        sc.close();
    }
}
