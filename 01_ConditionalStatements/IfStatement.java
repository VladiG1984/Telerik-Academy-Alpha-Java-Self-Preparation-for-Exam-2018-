import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your password (you can trust us):");
		String password = scanner.nextLine();
		
		if (password.length() >= 6) {
			System.out.println("Valid password");		
		}
		
		else {
			System.out.println("Please enter valid password!");
		}
		

	}

}
