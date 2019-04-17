class Factorial
{
	public static void main(String[]arg)
	{
		int fact=6;
		int a=1;
		int x=1;
		while(x<=fact){
			a=a*x;
			x++;
		}
		System.out.println("Factorial of "+fact+" is:"+a);
	}
}