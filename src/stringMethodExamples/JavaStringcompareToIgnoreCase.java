package stringMethodExamples;

public class JavaStringcompareToIgnoreCase {

	public static void main(String[] args) {
		
		String animal1 = "dog";
        String animal2 = "Dog";
        
        int result = animal1.compareToIgnoreCase(animal2);
        System.out.println("1st Example output:");
        System.out.println(result);
		
		 
        String fruit = "apple!";
        String fruit1 = "APPLE";
        int result1 = fruit.compareToIgnoreCase(fruit1);
		System.out.println("2nd Example output:");
		System.out.println(result1);
		 
		
	     String alphanumeric = "apple123";
	     String alphanumeric1 = "APPLE123asd";
	        
	        int result2 = alphanumeric.compareToIgnoreCase(alphanumeric1);
	        System.out.println("3rd Example output:");
	        System.out.println(result2);
		

	}

}
