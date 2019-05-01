import java.util.Scanner;
class ThirdProgram{
	public static void main(String[] args) 
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1; i<=N; i++){
			System.out.println("Enter a Number: ");
			num=sc.nextInt();
			sum=sum+num;	
		}
		System.out.print("Sum Of Numbers: "+sum);
	}
}