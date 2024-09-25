public class FIboSeries {
    public static void main(String args[]) {
        int f0 = 0, f1 = 1, f;
        System.out.println("First 10 Fibonacci Numbers are = \n");
        System.out.println(f0 + "");

        for (int i = 1; i<10; i++) {
            f = f0+f1;
            System.out.println(""+f+"");
            f1 = f0;
            f0 = f;

        }
    }
}
