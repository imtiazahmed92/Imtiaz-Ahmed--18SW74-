
class Student{
	private String name;
	private int age;
	private String address;
	Student(){
		name="unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Name of student: "+this.name);
		System.out.println("Age of student: "+this.age);
		System.out.println("Address of student: "+this.address);
	}
}
public class Task5{
	public static void main(String[] args) {
		Student[] s=new Student[10];
		for (int i=0;i<s.length ;i++ ) {
			s[i]=new Student();
		}
		s[0].setInfo("Imtiaz Ahmed",18,"Muet Hostel");
		s[1].setInfo("Waqar Ahmed",19,"Society");
		s[2].setInfo("M Usama",19,"Muet Hostel");
		s[3].setInfo("Ahmed Ali",19,"Muet Hostel");
		s[4].setInfo("Uzair Ali",18,"Jamshoro");
		s[5].setInfo("Mudassir",19,"Qasimabad Hyderabad");
		s[6].setInfo("Qudoos",19,"Qasimabad Hyderabad");
		s[7].setInfo("Jahanzaib",19,"Muet Hostel");
		s[8].setInfo("Sarwan ",19,"Muet Hostel");
		s[9].setInfo("Yasir",19,"Muet Hostel");

		
		
				

	}
}