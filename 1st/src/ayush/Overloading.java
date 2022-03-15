package ayush;
class Cal
{
	public void show1()
	{
		
	}
}
class Calculator extends Cal
{
	public void show1(int a,int b)
	{
		System.out.println("sum"+(a+b));
	}
	public void show1(double a,double b)
	{
		System.out.println("sub"+(a-b));
	}
	public void show1(float a,float b)
	{
		System.out.println("mul"+(a*b));
	}
	public void show1(int a,double b)
	{
		System.out.println("div"+(a/b));
	}
}
public class Overloading {
	public static void main(String[] args) {
	Calculator kk=new Calculator();
	kk.show1(20,30);
	kk.show1(30.4,40.3);
	kk.show1(33.333,4.222);
	kk.show1(10,2.5);
		
	}
}
