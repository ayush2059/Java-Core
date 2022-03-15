package ayush;
import java.util.Scanner;
public class twodarray {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of salesman");
	int[][]arr=new int[s.nextInt()][];
	for(int i=0;i<arr.length;i++) {
	System.out.println("enter the no of sale by salesman"+i);
	arr[i]=new int[s.nextInt()];
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println("enter the price");
		arr[i][j]=s.nextInt();
	}
	}
	int sum=0;
	for(int[]brr:arr)
	{
		for(int a:brr)
		{
			sum=sum+a;
		}
	}
   System.out.println("sum=>"+sum);
}
}