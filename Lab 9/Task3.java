class MyCalculator
{
	long pow=1;
	public long power(int n,int p)throws Exception{
		if(n>0 && p>0){
			for(int i=1; i<=p; i++){
				pow*=n;
			}
		}
		else
		{
			throw new Exception("n and p can not be negative or zero");
		}
		return pow;
	}
	public static void main(String[]args){
		MyCalculator a=new MyCalculator();
		try{
			long x=a.power(2,0);
			System.out.println(x);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}