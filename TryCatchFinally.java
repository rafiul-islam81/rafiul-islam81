public class TryCatchFinally {
    public static void main(String[] args) {
        int a = 24;
        try {
            int res = a/0;
            System.out.println("Result is: "+res);
        }
        catch(ArithmeticException e) {
            System.out.println("Raised zero division error! Can't divide by zero.");
        }
        finally {
            System.out.println("This is always executed and program has been finished.");
        }
    }
    
}
