package ayush;
interface Convetor
{
	static int jj=39;
	int mtocm=100;
	int cmtomm=10;
	default void shol()
	{
		System.out.println("ayushk");
	}
}
interface Weigthconvtor extends Convetor
{
	int kgtog=100;
}
//class Rslts implements Convetor,Weigthconvtor
class Rslts implements Weigthconvtor
{
	int l1=1000;
	int l2=70;
	int k3=50;
	public void show1()
	{
		System.out.println("ans mtocm"+(l1*mtocm));
		System.out.println("ans cmtomm"+(l2*cmtomm));
		System.out.println("ans kgtog"+(k3*kgtog));
	}
	public  void shol()
	{
		System.out.println("end of interface");
	}
}
public class Interface {

	public static void main(String[] args) {
	Rslts ctr;
	ctr=new Rslts();
	ctr.show1();
	ctr.shol();

	}
}
