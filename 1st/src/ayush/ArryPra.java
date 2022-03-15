package ayush;
import java.util.Scanner;

public class ArryPra {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of epmloyees");
	int emplno=s.nextInt() ;
	int[]arr=new int[emplno];
	for(int i=0;i<arr.length;i++) {
	System.out.println("enter salary of employees"+" "+i);
	arr[i]=s.nextInt();
	}
	int sum=0;
	for(int a:arr)
	{
		sum=sum+a;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("employee"+" "+i+" "+"salay->"+" "+arr[i]);
	}
	System.out.println("total salay"+" "+sum);
}
}
