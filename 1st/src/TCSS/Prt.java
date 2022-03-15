package TCSS;
abstract class Ah
{
	public void show()
	{
		System.out.println();
	}
}
class Abh extends Ah
{
	public void show()
	{
		System.out.println("ayush tra");
	}
	
}
public class Prt {

	public static void main(String[] args) {
		Abh kl=new Abh();
		kl.show();

	}

}
