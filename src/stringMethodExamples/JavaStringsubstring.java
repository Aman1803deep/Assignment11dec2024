package stringMethodExamples;

public class JavaStringsubstring {

	public static void main(String[] args) {
		    String name = "Aman, deep!";
	        String subStr = name.substring(6);
	        System.out.println(subStr); 
	        
	        String course = "Learning something new";
	        String subStr1 = course.substring(0, 5);  // Extract "Java"
	        String subStr2 = course.substring(8,18); // Extract "programming"
	        
	        System.out.println(subStr1 + subStr2 );  // Output: "Java"
	        System.out.println();
	        
	        String num = "12345-67890";
	        String subStr3 = num.substring(5, 10);  // Extract "67890"
	        System.out.println("The extracted substring is: " + subStr3);

	}

}
