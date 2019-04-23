import java.util.Scanner;
class FirstProgram{
	public static void main(String[]arg)
	{
		double sub1,sub2,sub3;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter Marks in C++: ");
		sub1=in.nextDouble();
		System.out.print("Enter Marks in Data Structure: ");
		sub2=in.nextDouble();
		System.out.print("Enter Marks in Operating System: ");
		sub3=in.nextDouble();
		int totalMarks=300;
		double obtMarks=sub1+sub2+sub3;
		double per=(obtMarks/totalMarks)*100;
		System.out.println("Total Marks= "+totalMarks);
		System.out.println("Obtained Marks= "+obtMarks);
		System.out.println("Percentage= "+per);
		if(per>90){
			System.out.println("Grade A");
		}
		else if(per>=80 && per<=90){
			System.out.println("Grade B");
		}
		else if(per<80 && per>=70){
			System.out.println("Grade C");
		}
		else if(per<70 && per>=60){
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("FAIL!");
		}
	}
}