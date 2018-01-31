import java.util.Scanner;
import java.text.DecimalFormat;

public class ExchangeIfGreater {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double intA = Double.parseDouble(scanner.nextLine());
		
		double intB = Double.parseDouble(scanner.nextLine());
		
		DecimalFormat df = new DecimalFormat("#.#");
		
		if (intA > intB) {
			System.out.println(df.format(intB) + " " + df.format(intA));
		}
		
		else {
			System.out.println(df.format(intA) + " " + df.format(intB));
		}

	}

}
