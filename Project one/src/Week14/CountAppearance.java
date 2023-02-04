package Week14;

public class CountAppearance {

		// Write Your Code Here
			int count = 0;
			for (String word : arr) {
				if (word.equals(t)) {
					count++;
				}
			}
			return count;
	
	
	
	public static void main(String[] args) {
		String[] arr = { "a", "foo", "bar", "foo", "blabla", "foo" };
		String t = "foo";
		int count = 0;

		System.out.println(count_appearance(arr, t));

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals(t)) {
//				count++;
//			}
//		}

//		for (String word : arr) {
//			if (word.equals(t)) {
//				count++;
//			}
//
//		}
//		System.out.println(count);

	}

	public static int count_appearance(String[] arr, String t) {
		// Write Your Code Here
		int count = 0;
		for (String word : arr) {
			if (word.equals(t)) {
				count++;
			}
		}
		return count;

	


