package stringMethodExamples;

public class JavaStringequalsIgnoreCase {

	public static void main(String[] args) {
		    String h = "hello";
	        String H = "HELLO";
	        
	        boolean result = h.equalsIgnoreCase(H);
	        System.out.println(result);
	        
	        String hh = "hello";
	        String Empty = null;
	        
	        boolean result2 = hh.equalsIgnoreCase(Empty);
	        System.out.println(result2);
	}

}
