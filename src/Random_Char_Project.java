public class Random_Char_Project {
	public static void main(String[] args) {
		
		// Establish limits
		int letterA = 65;
		int letterZ = 90;
		int letterRange = letterZ - letterA + 1;
		
		// Generate random letter
		int randomLetter = letterA + (int)Math.random() * letterRange;
	
		// Output random letter
		System.out.print("Your random letter is: " + (char)randomLetter);

	}

}