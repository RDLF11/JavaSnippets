import java.util.Scanner;

public class scannerHelp {

	public static void scannerClosing() {
		
	int number1;
	
		Scanner YourScannerName = new Scanner (System.in);
		
		
		System.out.println("Intoduce an integer: ");
		number1 = YourScannerName.nextInt(); //Reading the first number (inputed with the keyboard)
		
		System.out.println("The number introduced is " + number1 + "\n"); //Check the introduced number
		
		//https://www.tutorialspoint.com/java/util/scanner_close.htm
		// close the scanner
		System.out.println("Closing Scanner...");
		YourScannerName.close();
		System.out.println("Scanner Closed.");

	}

		//to scan individual characters
		
		//https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
		//Didn't know how to scan for a character
		//input.next().charAt(0);

		
	public static void main(String[] args) {

		scannerClosing();
		
	}

}
