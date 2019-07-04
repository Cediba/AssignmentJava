package inheritance;

public class My_Calculation extends Calculation {

        public void multiplication(int num1, int num2) {
            total = num1 * num2;
            System.out.println("The product of given numbers is: " + total);
        }
    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
        }
}
