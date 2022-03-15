package ayush;
abstract class Shapes
{
	int d;
	static int m=9;
	//Shapes()
	//{
	//	d=20;
	//}
	public abstract void areas();
	public void detl()
	{
		
	}
}
class Circles extends Shapes
{
	int r;
	Circles(int a)
	{
		this.r=a;
	}
	public void areas()
	{
		System.out.println(3.14*r*r);
	}
}
class Rectangles extends Shapes
{
	int l;
	int b;
	Rectangles(int a,int b)
	{
		this.l=a;
		this.b=b;
	}
	public void areas()
	{
		System.out.println(l*b);
	}
}
class Squares extends Shapes
{
	Squares(int a)
	{
		d=40;
	}
	public void areas() {
		System.out.println(d*d);
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		Shapes ls;
		ls=new Circles(7);
		ls.areas();
		ls=new Rectangles(5,4);
		ls.areas();
		ls=new Squares(20);
		ls.areas();
	} }
