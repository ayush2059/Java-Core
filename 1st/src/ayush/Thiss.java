package ayush;
class Thisxemo{
	int a;
	int b;
	public void show(int a,int b)
	{
		a=a;
		b=b;
	}
	public void show()
	{
		System.out.println(a+b);
	}
}
public class Thiss {

	public static void main(String[] args) {
		Thisxemo obj=new Thisxemo();
		obj.show(10,20);
		obj.show();

	}

}
