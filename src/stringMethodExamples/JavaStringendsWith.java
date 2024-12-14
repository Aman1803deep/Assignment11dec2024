package stringMethodExamples;

public class JavaStringendsWith {

	public static void main(String[] args) {
		     String File = "example.txt";
	        
	        System.out.println(File.endsWith(".txt"));  // true
	        System.out.println(File.endsWith(".pdf"));  // false
	        
	        
	        String url = "https://www.example.com";
	        
	        System.out.println(url.endsWith(".com"));  // true
	        System.out.println(url.endsWith(".org"));
	        
	        String str = "Hello World ";
	        
	        System.out.println(str.endsWith(" "));

	}

}
