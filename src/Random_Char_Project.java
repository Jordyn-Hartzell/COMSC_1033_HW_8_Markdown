public class Random_Char_Project {
	public static void main(String[] args) {
		// Establish limits
		int letterA = 65;
		int letterZ = 90;
		
		// Generate random letter
		int randomLetter = letterA + (int)Math.random() * letterZ;
	
		// Output random letter
		System.out.print(randomLetter);

	}

}
