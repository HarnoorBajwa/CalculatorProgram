import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // Take input from user till user does not press X or x
        char op = kb.next().trim().charAt(0);
        System.out.println("Enter an operator");

        if( op =='+' || op == '-' || op == '*' || op== '/' || op == '%'){
            System.out.println("Enter two numbers");
        }
    }


}
