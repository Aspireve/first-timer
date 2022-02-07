import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    char operator;
        Double number1, number2, remainder, result;
        Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Java Calculator");
		System.out.println("Enter number in the form:");
		System.out.println("First Number <Enter> Operator <Enter> Second Number <Enter>");
		number1 = input.nextDouble();
		operator = input.next().charAt(0);
		number2 = input.nextDouble();
		
		switch (operator) {
          case '+':
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;
          case '-':
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;
          case '*':
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;
          case '/':
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;
          default:
            System.out.println("Operator Not Defined");
            break;
        }
		
	}
}
