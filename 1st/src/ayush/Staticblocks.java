package ayush;
class Adxxxxxy
{
	static int a;
	static int b;
	//int c;
	//Adx(int a)
	//{
	//	this.c=a;
	//}
	static
	{
		a=10;
		b=20;
		System.out.println("static block evaluated");
	}
	public void show()
	{
		System.out.println(a+b);
		System.out.println("again static block evaluted");
	}
	//public void show1()
	//{
	//	System.out.println(c);
	//}
}
public class Staticblocks  {
	//static
	//{
	//System.out.println("amanhbv");
	//}
	public static void main(String[] args)throws ClassNotFoundException {
	//Adx obj=new Adx(60);
	//obj.show();
	//obj.show1();
	Class.forName("Adxxxxy");
	}

}
