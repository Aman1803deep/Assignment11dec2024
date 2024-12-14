package stringMethodExamples;

public class JavaStringmatches {

	public static void main(String[] args) {
		
		    String S = "abc123";
	        
	        //  match a string of exactly 6 characters
	        boolean B = S.matches(".{6}");
	        System.out.println("Matches: " + B); 
	        
	        String str = "HelloWorld";
	        
	        //  check if the string does not contain digits
	        boolean B1 = str.matches("[^0-9]+");
	        System.out.println("Matches: " + B1);
	        
	        String b3 = "A123";
	        
	        //  to match an uppercase letter followed by digits
	        boolean B3 = b3.matches("[A-Z]\\d+");
	        System.out.println("Matches: " + B3);

	}

}
