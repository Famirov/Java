package personalmodules;

public class practice123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]tempArray= {-23, -44, 12, 99, 4444};
		
		int max2 = tempArray[0];
		int max1 = tempArray [0];
		
		for (int i=0; i<tempArray.length; i++) {
			
			if (max2 < max1) {
				max2 = tempArray[i];
				
			}else if(max1 < tempArray[i]) {
				max1 = tempArray[i];
				}
			}

		System.out.println(max2);
		System.out.println(max1);

	}

}
