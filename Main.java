import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        System.out.println("Enter the operator you want to calculate +,-,*,/,%");
        char op = sc.next().charAt(0);


        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
        }
    }
}
