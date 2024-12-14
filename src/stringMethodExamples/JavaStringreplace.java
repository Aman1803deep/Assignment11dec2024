package stringMethodExamples;

public class JavaStringreplace {

	public static void main(String[] args) {
		    String Name = "AmandeepK";
	        String updatedString = Name.replace('K', ' ');
	        System.out.println(updatedString);  
	        
	        
	        String Name1 = "HellodWorld ";
	        String updatedString1 = Name1.replace('d', '!');
	        System.out.println(updatedString1);
	        
	        String password = "User1234";
	        String updatedString2 = password.replaceAll("[0-9]", "*");
	        System.out.println(updatedString2);
	        
	        
	}

}
