package ayush;
import java.util.Scanner;
class Voting extends Exception
{
	//public String getMessage()
	//{
	//	return "not eligible for voting";
	//}
	//Voting()
	//{
	//	super("not eligible for voting");
	//}
	Voting(String a)
	{
		super(a);
	}
	public String toString()
	{
		return "age less then voting";
	}
}
public class Throwsuserdefined  {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int a=s.nextInt();
		try {
		if(a<18)
		{
			throw new Voting("not eligible for voting");
		}
		else
		{
			System.out.println("eligible for voting");
		}
		}
		catch(Voting e) 
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}


	}

}
