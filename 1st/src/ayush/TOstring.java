package ayush;
class Eplys
{
	int id=1;
	String name;
	Eplys(String a)
	{
		this.name=a;
	}
	public void show()
	{
		System.out.println(name);
	}
	public String toString()
	{
		return name+" "+id;
		
	}
}
public class TOstring {

	public static void main(String[] args) {
		Eplys okl=new Eplys("ayush");
		String obn=new String("aman");
		System.out.println(okl);
		System.out.println(obn);

	}

}
