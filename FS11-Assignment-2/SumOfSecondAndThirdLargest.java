import java.util.Arrays;

public class SumOfSecondAndThirdLargest {

    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int secondLargest = getSecondLargest(values);
        int thirdLargest = getThirdLargest(values);
        int sum = secondLargest + thirdLargest;
        
        System.out.println("The sum of the 2nd and 3rd largest numbers is: " + sum);
    }

    private static int getSecondLargest(int[] values) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : values) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    private static int getThirdLargest(int[] values) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int value : values) {
            if (value > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                thirdLargest = secondLargest;
                secondLargest = value;
            } else if (value > thirdLargest && value < secondLargest) {
                thirdLargest = value;
            }
        }

        return thirdLargest;
    }
}