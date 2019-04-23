import java.util.Scanner;
class SecondProgram
{
	public static void main(String[]arg)
	{
		int x;
		int price;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of units");
		x=in.nextInt();
		if(x<=50){
		System.out.println("The total bill is:"+x*10+" Rupees");
		}
		else if(x>50 && x<=100){
			price=x-50;
			System.out.println((price*15+50*10)+" Rupees");
		}
		else if(x>100 && x<+200){
			price=x-100;
		System.out.println((price*20+50*15+50*10)+" Rupees");
		}
		else if(x>200 && x<=300){
			price=x-200;
			System.out.println((price*25+100*20+50*15+50*10)+" Rupees");
		}
		if(x>300){
			price=x-300;
			System.out.println((price*30+100*25+100*20+50*15+50*10)+" Rupees");
		}
	}
}