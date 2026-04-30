public class artthmeticerror {
    public static void main(String[] args) {
        int a = 10;
        int c = 0;
        //exception

        try{
            int result = a / c;
            
        System.out.println(result);
        }
        catch(ArithmeticException e ){
            
        System.out.println("can not divided by zero");

        }finally{
            
            
        System.out.println("change value of c");
        }

        System.out.println("End of program");
        
        
    }
    
}
