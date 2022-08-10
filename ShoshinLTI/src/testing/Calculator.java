package testing;


class Calculator {

	public static int fact(int a)
	{
		int f = 1;
		for(int i = 1 ; i <= a ; i++)
		{
			f = f*i;
		}
		return f;
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
}
