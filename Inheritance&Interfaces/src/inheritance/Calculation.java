package inheritance;

public class Calculation {
    int total;

    public void addition(int num1, int num2) {
        total = num1 + num2;
        System.out.println("The sum of of the numbers is: " + total);
    }

    public void subtraction(int num1, int num2) {
        total = num1 - num2;
        System.out.println("The difference between the number is: " + total);
    }
}

