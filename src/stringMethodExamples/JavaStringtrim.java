package stringMethodExamples;

public class JavaStringtrim {

	public static void main(String[] args) {
		String text = "   Hello, World!   ";
        System.out.println("Before trim: '" + text + "' ");
        String trimmedText = text.trim();
        System.out.println("After trim: '" + trimmedText + "New");
        
        String text1 = "\n   Hello, World!   \n";
        System.out.println("Before trim: '" + text + "'");
        String trimmedText1 = text.trim();
        System.out.println("After trim: '" + trimmedText + "'");

	}

}
