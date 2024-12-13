package foreachloop;

public class foreachExample2 {

	public static void main(String[] args) {
		
		 String[] words = {"Aman", "Harman", "Harpreet", "Gurpreet", "John"};

	        // Using foreach loop to convert each string to uppercase
	        for (String word : words) {
	            word = word.toUpperCase();  
	            System.out.println("with foreach:  "+word);
	        }
	        
	        //forloop code
	        
	        for (int i = 0; i < + words.length; i++) {
 
	        	words[i] = words[i].toUpperCase(); 
	        	
	        	 
			}
	        for (String word : words) {
	            word = word.toUpperCase();  
	            System.out.println("with forloop:  "+ word);
	        }
	       
	        
	        
	        

	}

}
