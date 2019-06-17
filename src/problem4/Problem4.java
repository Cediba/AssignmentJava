package problem4;

import java.util.Scanner;

public class Problem4 {

    private static int readInput() {
        System.out.println("Enter an input: ");
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        //scanner.close();
        return 0;
    }

    //public interface of this class
    public static int calculateSum() {
        int number = Problem4.readInput();
        int sum = 0;
        while (number >= 0) {
            sum = sum + number;
            return sum;
        }
        if (sum == 0) {
            System.out.println("The sum is 0.");
        } else {
            System.out.println("The sum of the numbers is: " + sum);
        }
        return number;
    }

}
