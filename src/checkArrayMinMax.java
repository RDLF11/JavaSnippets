public class checkArrayMinMax {

    public static void main(String[] args) {
    
    //Write  a  program  that,  given  the  following  integer  array  {5,  10,  3,  25,  30,  1,  54,  78,  23,  2,  12}
	//prints to screen the maximum and minimum values
	
		int[] array = {5,  10,  3,  25,  30,  1,  54,  78,  23,  2,  12};
		int min = array[0]; //use the initial value of the array and search
		int max = array[0]; //use the initial array value an search

		for (int i = 0; i < array.length; i++){

			if (array[i] < min){
			min = array[i];
			
			}
		}

		for (int j = 0; j < array.length; j++){

			if (array[j] > max){
			max = array[j];
			
			}

		}


		System.out.println("The min value of the array is: " + min);
		System.out.println("The max value of the array is: " + max);
        
    }
    
}
