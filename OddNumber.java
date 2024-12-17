public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;  // To keep track of how many odd numbers are printed
        int number = 1; // Start checking from 1

        System.out.println("First 10 odd numbers are:");
        while (count < 10) {
            if (number % 2 != 0) { // Check if the number is odd
                System.out.println(number);
                count++; // Increment the count of odd numbers
            }
            number++; // Increment the number to check next
        }
    }
}

