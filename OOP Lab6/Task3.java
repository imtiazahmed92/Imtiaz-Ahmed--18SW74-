class Print{
	int a;
	char ch;
	public void printValues(int a,char c){
		this.a=a;
		ch=c;
		System.out.println("Integer value is:"+this.a);
		System.out.println("Charecter value is:"+ch);
	}
	public void printValues(char c,int a){
		ch=c;
		this.a=a;
		System.out.println("Charecter value is:"+ch);
		System.out.println("Integer value is:"+this.a);
	}
}
public class Task3{
	public static void main(String[] args) {
		Print p=new Print();
		p.printValues(10,'A');
		p.printValues('A',50);
	}
}