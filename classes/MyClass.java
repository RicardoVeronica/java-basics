public class MyClass {

    public static void main(String[] args) {
        
        // Call my method
        double result = sumTwoNumbers(3, 6);

        System.out.println(result);

    }

    // My method
    public static double sumTwoNumbers(double a, double b) {
    
        double res_sum;

        res_sum = a + b;

        return res_sum;

    }

}
