package ayush;
import java.util.Scanner;
class Customer
{
	private int acno;
	private String name;
	private int bal;
	Customer(int a,String b,int c)
	{
		this.acno=a;
		this.name=b;
		this.bal=c;
	}
	public void getDetails()
	{
		System.out.println(acno+" "+name+" "+bal);
	}
}
public class nonprimitivearray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of customer");
		int x=s.nextInt();
		Customer[]arr=new Customer[x];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter acno,name,balance");
			int a=s.nextInt();
			s.nextLine();
			String b=s.nextLine();
			int c=s.nextInt();
			arr[i]=new Customer(a,b,c);
		}
		for(Customer c:arr)
		{
			c.getDetails();
		}

	}

	


}
