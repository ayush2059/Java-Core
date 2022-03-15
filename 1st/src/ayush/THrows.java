package ayush;
import java.util.Scanner;
class MyException extends Exception
{
	
}
class Call 
{
	public void a()
	{
		b();
	}
	public void b()
	{
		c();
	}
	public void c()
	{
		try {
		d();  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void d() throws Exception //throws MyException
	{
		//try {
		//throw new MyException();  //}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		//}
		
		Class.forName("ayush");
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter a no");
		//try{
		//int a=s.nextInt();
		//int b=s.nextInt();
		//System.out.println(a+b);
		//System.out.println(a/b);
		//}
		//catch(Exception e)
		//{
		//	System.out.println(e);
		//}
	}
}
public class THrows {

	public static void main(String[] args) //throws MyException 
	{
	//try {
	Call obj=new Call();
	obj.a();
	//}
	//catch(Exception e)
	//{
	//	System.out.println(e);
	//}

	}

}
