package ayush;
interface Fligth
{
	public abstract void fligthname(String a);
	public abstract void totalpasanger(int b);
	public abstract void totalcrew(int c);
}
class Pongo implements Fligth
{
	String a;
	int b;
	int c;
	public void fligthname(String a)
	{	
		this.a=a;
		System.out.println(a);
	}
	public void totalpasanger(int b) 
	{
		this.b=b;
		System.out.println(b);
	}
	public void totalcrew(int c) {
		this.c=c;
		System.out.println(c);
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Pongo po=new Pongo();
		po.fligthname("Air india");
		po.totalpasanger(90);
		po.totalcrew(10);	

	}}


