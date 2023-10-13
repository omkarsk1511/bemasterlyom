
public class strings {

	public static void main(String[] args) 
	{
		String s = "Rahul Shetty Accedmy";
		System.out.println(s);
		String s1 = "Rahul Shetty Accedmy";
		//It will not create new string
		String s2 = new String("Rahul Shetty Accedmy");
		//It will create new string

    //Split string with white space
		String[] Splitedstring = s.split("Shetty");
		System.out.println(Splitedstring[0]);
		System.out.println(Splitedstring[1]);
		System.out.println(Splitedstring[1].trim());
		
	//print char of string
		for (int i =0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
	//print char of string
		for (int i = s.length()-1; i<s.length();i--)
		{
			System.out.println(s.charAt(i));
		}	
		

	}

}
