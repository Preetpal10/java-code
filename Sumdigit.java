public class Sumdigit {
    public static void main(String[]args){
        int sum = 0, n = 453;
while (n > 0) {
    sum += n % 10;
    n /= 10;
}
System.out.println(sum);
    }
    
}
