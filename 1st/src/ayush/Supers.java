package ayush;
class Fatherr{
    int a;
	int b;
	int c;
	int d;
	Fatherr(int a,int b,int c,int d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	public void get()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
class Sonn extends Fatherr
{
	int e=50;
	Sonn(int a,int b,int c,int d)
	{
		super( a,b, c, d);
	}
	public void show()
	{
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
	}
}
public class Supers {

	public static void main(String[] args) {
		Sonn s=new Sonn(10,20,30,40);
		s.get();
		s.show();


	}

}
