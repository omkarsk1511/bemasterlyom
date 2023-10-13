package JavabyKaran;

public class elseif {

	public static void main(String[] args) {
		
		int totalmarks = 600;
		float  marksgot = 10;
		float perraw = marksgot/totalmarks;
		float per = perraw*100;
		System.out.println(per);
		
		if(per>=75)
		{
			System.out.println("You got distinction");
		}
		else if(per>=60&&per<75)
		{
			System.out.println("You scored first class");
		}
		else if(per>=50&&per<65)
		{
			System.out.println("You scored second class");
		}
		else if(per>=40&&per<50)
		{
			System.out.println("You scored third class");
		}
		else 
		{
			System.out.println("You are useless");
		}
	}
}
		
	


