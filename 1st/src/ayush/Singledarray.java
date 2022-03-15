package ayush;
import java.util.Scanner;

public class Singledarray {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of array");
	 int n=s.nextInt();
	 int []arr=new int[n];
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println("enter array elemet");
		 arr[i]=s.nextInt();
		 
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 int sum=0;
	 for(int x:arr)
	 {
		 sum=sum+x;
	 }
	 System.out.println(sum);

	}

}
