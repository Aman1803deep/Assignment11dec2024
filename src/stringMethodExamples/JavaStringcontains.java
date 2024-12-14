package stringMethodExamples;

public class JavaStringcontains {

	public static void main(String[] args) {
		    String S = "Hello, everyone!";
	        String keyword = "Hello";
	        
	        boolean result =  S.contains(keyword);
	        System.out.println(result);

	        
	        String T = "Hello, $pecial characters!";
	        boolean result1 = T.contains("$");
	        System.out.println(result1);
	        
	        boolean result2 = T.contains("J");
	        System.out.println(result2);
	        
	        
	}

}
