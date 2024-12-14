package stringMethodExamples;

public class JavaStringequals {

	public static void main(String[] args) {
		    String str1 = "hello ";
	        String str2 = "hello";
	        
	        boolean result = str1.equals(str2);
	        System.out.println(result);
	        
	        
	        String str3 = "java";
	        String str4 = "ja" + "va";  // String concatenation
	        
	        boolean result1 = str3.equals(str4);
	        System.out.println(result1);
	        
	        String str5 = "hello";
	        String str6 = "Hello";
	        
	        boolean result2 = str5.equalsIgnoreCase(str6);
	        System.out.println(result2); 
		

	}

}
