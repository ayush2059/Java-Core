package ayush;
class Xero{
	int a=10;
	int b=20;
	/*Xero()
	{
		System.out.println("welcom");
	}
	Xero(int a,int b)
	{
		this();
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println(a+b);
	} 
	*/
	Xero()
	{
		this(20,30);
		System.out.println("ayush raj");
	}
	Xero(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void show()
	{
		System.out.println(a+b);
	} 
	
}

public class Thisss2 {

	public static void main(String[] args) {
		//Xero xe=new Xero(10,20);
		//xe.show();
		Xero obj=new Xero();
		obj.show();
		


	}

}
