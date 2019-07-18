class invalidage extends Exception{
	invalidage(String s){
		super(s);
	}
}
class voting{
	String[] c;
	int []count;
	public void addcandidate(String[]name){
		c=name;
		count=new int[name.length];
	}
	public void castvote(String name,int age){
		for(int i=0; i<c.length; i++){
			if(name.equals(c[i])){
				count[i]++;
			}
		}
	}
	public void showresult(){
		for(int i=0; i<c.length; i++){
			System.out.println("Votes casted for "+c[i]+" are "+count[i]+".");
		}
	}
}
class Main
{
	public static void main(String[]args)throws invalidage{
		voting m1=new voting();
		String name[]={"Imtiaz","Waqar","Uzair"};
		m1.addcandidate(name);
		int age=18;
		try{
			if(age<18){
				throw new invalidage("Age is bellow 18");
			}
			else
			m1.castvote("Imtiaz",age);
			m1.castvote("Waqar",age);
			m1.castvote("Uzair",age);
		}
		catch(Exception e){
			System.out.println("");
		}
		m1.showresult();
	}
}