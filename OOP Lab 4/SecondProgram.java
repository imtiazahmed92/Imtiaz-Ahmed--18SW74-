import java.util.Scanner;
class SecondProgram{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int num;
		num=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start; i<=end; i++){
		int	a=num*i;
		start=num*i;
			System.out.println(num+"X"+i+"="+a);
		}
	}
}