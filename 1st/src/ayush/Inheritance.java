package ayush;
class Father{
    int a;
	int b;
	int c;
	int d;
	Father()
	{
		a=10;
		b=20;
		c=30;
		d=40;
	}
	public void get()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
class Son extends Father
{
	int e=50;
	Son()
	{
		
	}
	
	public void show()
	{
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		//Father f=new Father();
		Son s=new Son();
		s.get();
		s.show();

	}

}
