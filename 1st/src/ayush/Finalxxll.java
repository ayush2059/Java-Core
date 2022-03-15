package ayush;
class Degree{
	//final int a=10;
	//final int b=20;
	//final int a;
	//final int b;
	//{
	//	a=10;
	//	b=20;
	//}
	final int a;
	Degree(int a,int b)
	{
		this.a=a+b;
	}
	Degree(int a)
	{
		this.a=a;
	}
	
	public void show()
	{
		System.out.println(a);
	}
	public void show1()
	{
		System.out.println(a);
	}
}
public class Finalxxll {

	public static void main(String[] args) {
	Degree obj=new Degree(10,20);
	Degree obj1=new Degree(10);
	obj.show();
	obj1.show();

	}

}
