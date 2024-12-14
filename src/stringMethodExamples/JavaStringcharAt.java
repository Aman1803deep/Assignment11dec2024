package stringMethodExamples;

public class JavaStringcharAt {

	public static void main(String[] args) {
		
		    String text = "Java 101!";
	       
		    //example 1
	        char ch = text.charAt(7);
	        System.out.println("Character at index 7: " + ch); 
	        
	        //example 2
	        char lastChar = text.charAt(text.length() - 1);  
	        System.out.println("Last character: " + lastChar);  
	        
	        //example 3
	        for (int i = 0; i < text.length(); i++) {
	            System.out.println("Character at index " + i + ": " + text.charAt(i));
	        }

	}

}
