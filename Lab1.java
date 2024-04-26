import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {


        // Task 1
        int[] numbers = {5, 2, 11, 8};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max - min);


        // Task 2
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);


        // Task 3
        double x = 2;
        double y = 3;
        System.out.println((x * x) + (((4 * y) / 5 - x) * ((4 * y) / 5 - x)));

    }
}