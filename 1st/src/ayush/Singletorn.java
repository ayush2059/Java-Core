package ayush;
class A12
{
	int a11;
	int b22;
	int c33;
	int d44;
	public static A12 getA()//singalton
	{
		return new A12();
	}
	 A12()
	{
		a11=10;
		b22=20;
		c33=30;
		d44=40;
	}
	
}
class B13 extends A12
{
	public B13() {
		
	}
	public void show()
	{
		System.out.println(a11+b22+c33+d44);
	}
	
}
public class Singletorn {

	public static void main(String[] args) {
		A12 obj=A12.getA();
		B13 obj1=new B13();
		obj1.show();

	}

}
