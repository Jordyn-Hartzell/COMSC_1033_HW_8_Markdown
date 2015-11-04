public class Random_Char_Project {
	public static void main(String[] args) {
		
		// Establish limits
		int startingNumber = 65;
		int endingNumber   = 90 - 65 + 1;
		
		// Generate random number
		int randomNumber = (int)(startingNumber + Math.random() * endingNumber);
	
		// Output random number as a letter
		System.out.println(randomNumber + " is your random number.");
		System.out.print("Therefore, your letter is " + (char)randomNumber + ".");

	}

}