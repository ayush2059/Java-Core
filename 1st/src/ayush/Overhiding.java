package ayush;
class Agra
{
	public static void show()
	{
		System.out.println("pagal");
	}
}
class Up extends Agra
{
	public static void show()
	{
		System.out.println("shi ho gya");
	}
}
public class Overhiding {

	public static void main(String[] args) {
		Up city=new Up();
		city.show();
	}

}
