package ayush;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter two no");
	try {
	int a=s.nextInt();
	int b=s.nextInt();
	//System.exit(0);
	//System.out.println(a+b);
	//System.out.println(a-b);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		//System.out.println("finally invoked");
	
	}
	}

}
