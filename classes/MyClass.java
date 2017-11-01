/**
 * Program to show how the methods works
 * Author: setcain
 * @version 1.0.0
 * Date 31/10/17*/

public class MyClass {

    public static void main(String[] args) {
        
        // Call my method
        double result = sumTwoNumbers(3, 6);

        System.out.println(result);

    }

    // My method
    public static double sumTwoNumbers(double a, double b) {
    
        double resSum;

        resSum = a + b;

        return resSum;

    }

}
