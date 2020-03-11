import java.lang.*;
public class staticTest {
	public static int c= 0;
	public void incr()
	{
		c++;
	}
	public void get()
	{
		System.out.println("Value of c="+c);
	}
	public static void main(String args[])
	{
		staticTest obj = new staticTest();
		obj.incr();
		obj.incr();
		obj.get();
		staticTest obj1 = new staticTest();
		obj1.incr();
		obj1.incr();
		obj1.get();
	}
}

