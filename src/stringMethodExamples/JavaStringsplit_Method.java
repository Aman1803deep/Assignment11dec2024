package stringMethodExamples;

public class JavaStringsplit_Method {

	public static void main(String[] args) {
		
		//1st example 
		String text = "Happy,New,Year";
        String[] newyears = text.split(",");
     
        System.out.println("1st Example output:");
        for (String newyear : newyears) {
        	
            System.out.println( newyear);
           
        }
    
        // 2nd examples
        
        
        String numbers ="apple, banana; cherry.orange";
        String[] newyear1 = text.split("[,;.]");
    	System.out.println("2ND Example output:");
        for (String newyear : newyear1) {
        
            System.out.println(newyear);
           
        }
        
        //3rd example
        
        String text1 = "apple123banana456cherry";
        String[] fruits = text.split("\\d+");
        
        System.out.println("3RD Example output:");
        for (String fruit : fruits) {
        	
            System.out.println(fruit);
           
        }
        

	}

}
