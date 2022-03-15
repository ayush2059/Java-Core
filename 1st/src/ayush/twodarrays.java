package ayush;

import java.util.Scanner;

class Arrays{
	public void show()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of salesman");
		int[][]arr=new int[s.nextInt()][];
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("enter no sales done by each salesman"+i);
			arr[i]= new int[s.nextInt()];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter salemen"+i+" "+"products rate"+" "+j);
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("\t"+ arr[i][j]);
			}System.out.println();
		}
		for(int[]brr:arr)
		{
			int sum=0;
			for(int a:brr)
			{
				sum=sum+a;
			}System.out.println("total sale"+sum);
			
		}
	}
}
public class twodarrays {

	public static void main(String[] args) {
		Arrays obj=new Arrays();
		obj.show();

	}

}
