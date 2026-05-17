import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplication {

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> result = removeDuplicates(list);

        System.out.println("After Removing Duplicates:");
        System.out.println(result);

        sc.close();
    }
}