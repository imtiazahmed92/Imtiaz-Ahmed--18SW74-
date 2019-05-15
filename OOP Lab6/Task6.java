class UseStatic{
	private String name;
	private static int age;
	public void getName(String name){
		this.name=name;
		System.out.println("name="+this.name);
	}
	public static void getAge(){
		age=18;
		System.out.println("age="+age);
	}
}
public class Task6{
	public static void main(String[] args) {
		UseStatic s1=new UseStatic();
		UseStatic s2=new UseStatic();
		s1.getName("iMTIAZ AHMED");
		s1.getAge();
		s2.getName("MUNEER AHMED");
		s2.getAge();
		}
}
