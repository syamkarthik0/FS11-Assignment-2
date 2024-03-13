public class Swap {
    public static void main(String[] args) {
        int a = 200, b = 300;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap a and b without using a third variable and (+ and -) operators
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}