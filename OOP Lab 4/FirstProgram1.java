class FirstProgram1{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1; i<=5; i++){
			for(int j=5; j>i; j--){
				System.out.print(" ");
			}
			for(int z=1; z<=a; z++){
				System.out.print("*");
			}
			System.out.println();
			a+=2;
		}
	}
}