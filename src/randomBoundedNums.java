import java.util.concurrent.ThreadLocalRandom;

public class randomBoundedNums {

	public static void randomBoundedNums(int a, int b) {

		// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
				// nextInt is normally exclusive of the top value- so add 1 to make it inclusive
				// nextInt IS inclusive in its lower value	
		final int randomNum = ThreadLocalRandom.current().nextInt(a + 1, b);
		
		System.out.println(randomNum);
	}

	public static void main(String[] args) {
		randomBoundedNums(1,3);	
	}
}
