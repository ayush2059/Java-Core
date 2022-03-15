package ayush;

import java.util.Scanner;

class Ipl{
	private int tr;
	private String nme;
	public Ipl()
	{
		Scanner s=new Scanner(System.in);
		tr=s.nextInt();
		s.nextLine();
		nme=s.nextLine();
	}
	public void show()
	{
		System.out.println(tr+ " "+nme);
	}
}

public class Clasx {

	public static void main(String[] args) {
		Ipl obj=new Ipl();
		obj.show();

	}

}
