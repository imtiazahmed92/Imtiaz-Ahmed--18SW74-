class Task1
{
public static void main(String[]arg)
{
String name="Imtiaz Ahmed";
double totalmarks=650;
double obtainedmarks=550;
double percentage=obtainedmarks/totalmarks*100;
char a='A';
boolean b=(obtainedmarks>350);
if(b=true){
	System.out.println("Pass");
}
else
{
	System.out.print("Fail");
}
System.out.println("Name:"+name);
System.out.println("Total Marks:"+totalmarks);
System.out.println("Obtained Marks:"+obtainedmarks);
System.out.println("Percentage:"+percentage);
System.out.println("Gread:"+a);
System.out.println(b);
}
}