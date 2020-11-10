public class reverseA1dArray{

    public static void main(String[] args) {

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};

		//We declared the lenght of the reverse Array as something dependent on the size of the original array
		String[] reverseDays = new String [days.length];

		System.out.println("This is the original array:");
		for (int t = 0; t < days.length; t++){
			
			System.out.println(days[t]);
		}

		//the array is reversed with this for loop, one by one
		//explanation below
		for (int i = 0; i < days.length; i++){

			//first case i = 0
			//        (days.lenght - 1) = day.lenght natural lenght
			// reverseDays[0] = days.lenght - 1 - 0
			reverseDays[i] = days[days.length - 1 - i];
		}

		System.out.println("\nThis is the array reversed:");
		for (int j = 0; j < reverseDays.length; j++){
			
			System.out.println(reverseDays[j]);
		}	
    
    }

}
