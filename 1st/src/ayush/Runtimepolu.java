package ayush;

import java.util.Scanner;

class Shape
{
	public  void area()
	{
		System.out.println("area of shape");
	}
}
class Circle extends Shape
{
	int rad;
	Circle(int a)
	{
		this.rad=a;
	}
	public void area()
	{
		System.out.println(3.14*rad*rad);
	}
}
class Rectangle extends Shape
{
	int l;
	int b;
	Rectangle()
	{
		
	}
	Rectangle(int a,int b)
	{
		this.l=a;
		this.b=b;
	}
	public void area()
	{
		System.out.println(l*b);
	}
	public void name()
	{
		System.out.println("ayushj");
	}
}
public class Runtimepolu {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter radius,leng,bredth");
	int r=s1.nextInt();
	int l=s1.nextInt();
	int b=s1.nextInt();
	Shape s;
	s=new Shape();
	s.area();
	s=new Circle(r);
	s.area();
	s=new Rectangle(l,b);
	s.area();
	Rectangle sd=new Rectangle();
	sd.name();
	
	

	}

}
