
public class Corejavabasic {

	public static void main(String[] args) {
		
		//Datatypes
		int a = 5;
		String name = "omkar";
		char letter = 'o';
		double b = 5.99;
		float c = 12;
		boolean cond = true;
		
		//System.out.println(a);
		//System.out.println(name);
		//System.out.println(letter);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(cond+" its true");
		//System.out.println("omkar");

		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		//System.out.println(arr1[2]);
		
		int[] arr2 = {1,2,3,4,5};
		//System.out.println(arr2[2]);
		
		//for loop
		for (int i = 0; i< arr1.length; i++)
			// i starts from zero so i = 0
		{
			System.out.println(arr1[i]);
		}
		
	}
}


