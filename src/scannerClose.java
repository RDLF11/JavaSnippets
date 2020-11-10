import java.util.Scanner;

public class scannerClose {

	public scannerClose() {
		
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

}
