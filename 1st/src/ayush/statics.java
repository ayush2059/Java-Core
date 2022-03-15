package ayush;
import java.util.Scanner;
class Bank{
	private  int cid;
	private String name;
	private int saving;
	private static double roi;
	private static int count;
	public static int total_customer()
	{
	     return count;
	}
	public static void set_roii(double a)
	{
	     roi=a;
	}
	public static double get_roii()
	{
	     return roi;
	}
    Bank(int a,String b,int c)
	{
		this.cid=a;
		this.name=b;
		this.saving=c;
		count++;
	}
	public void show()
	{
		System.out.println(cid+" "+name+" "+saving);
	}
	
}
public class statics {
	
	public static void main(String[] args) {
	System.out.println(Bank.total_customer());
	Bank b=new Bank(1,"ayush raj",2500);
	Bank b1=new Bank(2,"adarsh raj",3500);
	Bank b2=new Bank(3,"ani raj",8500);
    b.show();
    b1.show();
    b2.show();
    Bank.set_roii(3.5);
    System.out.println(Bank.get_roii());
    System.out.println(Bank.total_customer());
	}

}
