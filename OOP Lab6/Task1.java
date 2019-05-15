class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public String setEmail(String email){
		this.email=email;
		return this.email;
	}
	public char getGender(){
		return this.gender;
	}
	public String toString(){
	 return ("Author[name="+this.name+",email="+this.email+",gender="+this.gender+"]");

	}
}

public class Task1{
	public static void main(String[]args){
		Author a=new Author("IMTIAZ AHMED","imtiazahmedburiro@gmail.com",'M');
		System.out.println("Name="+a.getName());
		System.out.println("Email="+a.getEmail());
		System.out.println(a.setEmail("imtiazahmedburiro@gmail.com"));
		System.out.println("Gender="+a.getGender());
		System.out.print(a.toString());
	}
}