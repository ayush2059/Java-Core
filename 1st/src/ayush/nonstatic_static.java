package ayush;

public class nonstatic_static {
	public void greet()
	{
		System.out.println("happy diwali");
		greet1();
	
	}
	public void greet1()
	{
		System.out.println("happy happy holy");
	}
	public  static void greet2()
	{
		System.out.println("happy durga puja");
	}

	public static void main(String[] args) {
		nonstatic_static obj=new nonstatic_static();
		obj.greet();
		obj.greet1();
		nonstatic_static.greet2();
	}

}
