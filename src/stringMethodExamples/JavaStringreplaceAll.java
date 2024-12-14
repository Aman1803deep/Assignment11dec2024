package stringMethodExamples;

public class JavaStringreplaceAll {

	public static void main(String[] args) {
		String name = "Amandeep Kaur";
        String newstring = name.replaceAll("ee", "*");
        System.out.println(newstring);
        
        String newstring1 = name.replaceAll("deep", "  ");
        System.out.println(newstring1);
        
        String newstring2 = name.replaceAll("a", " A ");
        System.out.println(newstring2);

	}

}
