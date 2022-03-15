package ayush;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Trycatch {
public static void main(String[] args) {
	boolean k=false;
	while(k!=true)
	try {
	Scanner s=new Scanner(System.in);
	System.out.println("enter two no");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=a/b;
	System.out.println(a+b);
	System.out.println(c);
	k=true;
	}
	catch(InputMismatchException  |ArithmeticException e)
	{
	  System.out.println("only number valid");
	}
	//catch(ArithmeticException e)
	//{
	//	System.out.println("denominator cannot be zero");
	//}
	
}}
