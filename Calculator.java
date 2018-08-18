
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integer numbers: ");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int result = 0;
		char symb;
		System.out.println("Specify operation [div '/', sum '+', mult '*', sub '-']: ");
		System.out.println();
		Scanner go = new Scanner(System.in);
		String mark = go.nextLine();
		
		switch (mark) {
		case "div":
			symb = '/';
			result = number1 / number2;
			System.out.println("Result is: " + number1 + " " + symb + " " + number2 + " = " + result + " .");
			break;
		case "sum":
			symb = '+';
			result = number1 + number2;
			System.out.println("Result is: " + number1 + " " + symb + " " + number2 + " = " + result + " .");
			break;
		case "mult":
			symb = '*';
			result = number1 * number2;
			System.out.println("Result is: " + number1 + " " + symb + " " + number2 + " = " + result + " .");
			break;
		case "sub":
			symb = '-';
			result = number1 - number2;
			System.out.println("Result is: " + number1 + " " + symb + " " + number2 + " = " + result + " .");
			break;
		default :
			System.out.print("Invalid operation! ");
			break;
		}
			}

}
