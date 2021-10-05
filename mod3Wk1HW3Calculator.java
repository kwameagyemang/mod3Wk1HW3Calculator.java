//Build a calculator:
//Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.
//
//OPTIONS
//
//1. Add
//2. Subtract
//3. Multiply
//4. Divide
//5. Exit
//
//1. Write different methods for each module (add, subtract, multiply, and divide).
//2. Use switch/case to call the particular method.
//3. Take input inside the methods to perform the related operation.
//4. Return the answer and display it inside the main method.
//5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user
package week1homework;

//always import Scanner above class
import java.util.Scanner;

public class mod3Wk1HW3Calculator {
 
	public static void main(String[] args) {
//formula for Scanner(Scanner start with capital S) 
		Scanner scan = new Scanner(System.in); //create scanner object
		System.out.println("THIS IS MY CALCULATOR");
		System.out.println(".....................");
		System.out.println("*Choose Your Operation*");
		System.out.println("1 for Addition");
		System.out.println("2 for Substraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println(".....................");

		int choose = scan.nextInt(); //Read User Input in numbers, nextInt() method reads integer

		System.out.println("Enter Two Numbers:");
		int x = scan.nextInt(); //nextInt() method reads integer
		int y = scan.nextInt();
//switch statement to Output input by User
		switch (choose) {
		case 1:
			System.out.println("The answer is: " + add(x, y));
			break;
		case 2:
			System.out.println("The answer is: " + sub(x, y));
			break;
		case 3:
			System.out.println("The answer is: " + mul(x, y));
			break;
		case 4:
			System.out.println("The answer is: " + div(x, y));
			break;
		default:
			System.out.println("Invalid Entry, Try Again");
		}

	}

//methods are outside the main
	public static int add(int x, int y) {
		int num = x + y;
		return num;

	}

	public static int sub(int x, int y) {
		int num = x - y;
		return num;

	}

	public static int mul(int x, int y) {
		int num = x * y;
		return num;

	}

	public static int div(int x, int y) {
		int num = x / y;
		return num;

	}

}
