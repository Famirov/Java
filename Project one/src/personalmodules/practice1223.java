package personalmodules;

public class practice1223 {
	
	public static void main(String[] args) {
		
		String reversed = reverse("hello", 0);
		
		System.out.println(reversed);
		
	}
		
	public static String reverse(String str, int index) {
	    if (index >= str.length()) {
	        return str;
	    }
	    return reverse(str.charAt(index) + str, index + 1);
	}
	
}
		
		
		
		
		
		
	