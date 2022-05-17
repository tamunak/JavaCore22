package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        int result;
        for (int i = 0; i < 10; i++) {
            result = array[i];
            System.out.print(result + " ");
        }
        System.out.println();

        int maxArray = array[0];
        for (int j : array) {
            if (j > maxArray) {
                maxArray = j;
            }
        }
        System.out.println("Max number from array = " + maxArray);

        int minArray = array[0];
        for (int k : array) {
            if (k < minArray) {
                minArray = k;
            }
        }
        System.out.println("Min number from array = " + minArray);

        System.out.print("Even num: ");
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Uneven num: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Even sum = " + even);

        int uneven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                uneven++;
            }
        }
        System.out.println("Uneven sum = " + uneven);

        double average = 0;
        for (int i : array) {
            average += i;
        }
        System.out.println("Average array value = " + average / array.length);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print("Sum array = " + sum + " ");
    }
}


