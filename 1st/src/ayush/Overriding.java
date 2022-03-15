package ayush;
class Arrah
{
	public void show()
	{
		System.out.println("aarah");
	}
}
class Noida extends Arrah
{
	public void show()
	{
		System.out.println("noida");
	}
}
public class Overriding {

	public static void main(String[] args) {
	Noida obj=new Noida();
	obj.show();

	}

}
