package stringMethodExamples;

public class JavaStringstartsWith {

	public static void main(String[] args) {
        
		String S = "Hello World";
        
        System.out.println(S.startsWith("Hello"));  // true
        System.out.println(S.startsWith("World"));  // false
        
        System.out.println(S.startsWith("hello"));  

        System.out.println(S.startsWith("World", 6));
	}

}
