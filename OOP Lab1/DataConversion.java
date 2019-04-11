class DataConversion
{
	public static void main(String[]arg)
	{
	double a=50.25;
	long b=(int)a;
	double c=a-b;
	System.out.println("Actuall value is:"+a);
	System.out.println("Integral Part is:"+b);
	System.out.println("Fractional Part is:"+c);
	}
}