import java.util.Scanner;

public class reverce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        while(n != 0 ){
            int remainder = n % 10;
            int reverce = reverce * 10 + remainder;

            n = n/10;
        }
    
        if ( reverce = temp ){
            System.out.println(" This is a palindrom");
        } else {
            System.out.println(" this is not palindrom");
        }

    }
    
}
