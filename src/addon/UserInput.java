package addon;
import java.util.*;

public class UserInput {
	public static void main(String[]args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = S1.nextLine();
		System.out.println("Name is "+name);
		System.out.println("Enter the Mark : ");
		int marks = S1.nextInt();
		System.out.println("Mark is"+marks);
		
	}

}
