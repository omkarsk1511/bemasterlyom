
public class ifelse {

	public static void main(String[] args) {
		//If
		int[] arr3 = {1,2,4,5,6,7,8,9,10,122};
		
		for (int i=0;i<arr3.length;i++)
		{
			if (arr3[i] % 2 == 0)
			{
				System.out.println(arr3[i]+" is multiple of 2");
				break;
			}
			else
			{
				System.out.println(arr3[i]+" is not multuple of 2");
			
			}
		}
	}
}

	
