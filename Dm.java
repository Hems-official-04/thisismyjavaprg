package addon;

import java.util.*;

public class Dm {

	public static void main(String[]  args) {

		/*int a= 10;

		int b= 20;

		if(a<b) {

			System.out.print("yes");

		}

		else {

			System.out.print("No");

			

		}

	//nested if

			if(a%2==0) {

				System.out.println(a+"Even number");

		int a= 10;

		int b= 20;

		int c= 30;

		if(a>b && a>c) {

			System.out.println("a is greater");

			

		}

		else if(c>a && c>b) {

			System.out.println("c is greater");

		}

		else if(b<a && b>c) {

			System.out.println("b is greater");

		}

		else {

			System.out.println("all are qual");//if else if

		}*/

		//switch statement

		Scanner S1 = new Scanner(System.in);

		System.out.println("Enter a and b : ");

		int a = S1.nextInt();

		int b = S1.nextInt();

		char choice;

		System.out.println("+ or - : ");

		choice = S1.next().charAt(0);

		switch(choice) {

		case '+':

			int c= a+b;

			System.out.println("ADD : "+c);

		break;

		case '-':

			int d= a-b;

			System.out.println("SUB : "+d);

		break;

		default:

			System.out.println("INVALID");

		break;

		

		

		}

		

		

			}

		

		}

