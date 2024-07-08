pagake calcijava2;
public class A
{
	public final void show()
	{
			System.out.print("static Method");
	}
}
public class B extends A
{
	public final void show()
	{
			System.out.print("overriding method");
	}
}
public mymain3
{
	public static void main(String args[])
	{
	B.obj = new B();
	obj.A();
	}
}