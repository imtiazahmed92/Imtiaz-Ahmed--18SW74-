class Measure{
	int length;
	int breadth;
	public void calculate(int length){
		this.length=length;
		System.out.println("The Area of square is: "+this.length*this.length);
	}
	public void calculate(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		System.out.println("The Area of Rectangle is: "+this.length*this.breadth);
	}
}
public class Task4{
	public static void main(String[] args) {
		Measure m1=new Measure();
		m1.calculate(10);
		m1.calculate(10,5);
	}
}