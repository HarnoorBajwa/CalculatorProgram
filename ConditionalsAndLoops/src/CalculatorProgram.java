import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // Take input from user till user does not press X or x
        char op = kb.next().trim().charAt(0);
        int ans;
        while (true) {
            System.out.println("Enter an operator");

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers");

                int num1 = kb.nextInt();
                int num2 = kb.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Entry !");
            }

        }



    }
}
