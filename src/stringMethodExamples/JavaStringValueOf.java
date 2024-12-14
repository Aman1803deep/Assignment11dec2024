package stringMethodExamples;

public class JavaStringValueOf {

	public static void main(String[] args) {
		Object obj = null;
        String S = String.valueOf(obj);
        System.out.println("String value of obj: " + S);
        
        int num = 123;
        String s2 = String.valueOf(num);
        System.out.println("String value of num: " + s2);
        
        boolean flag = true;
        String S1 = String.valueOf(flag);
        System.out.println("String value of flag: " + S1);

	}

}
