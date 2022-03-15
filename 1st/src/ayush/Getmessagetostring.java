package ayush;
import java.util.Scanner;
public class Getmessagetostring {
	public static void main(String[] args) {
		boolean k=false;
		while(k!=true)
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two no ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		System.out.println(a/b);
		k=true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
		//catch(Exception e)
		//{
		//	System.out.println(e.getMessage());
		//}
	}

}
