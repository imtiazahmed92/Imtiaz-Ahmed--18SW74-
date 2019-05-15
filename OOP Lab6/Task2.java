class Book{
	private String name,name2;
	private Author[] authors;
	private double price;
	private int qnty;
	Book(String name,Author[] authors,double price){
		this.name=name;
		this.authors=authors;
		this.price=price;
		
	}
	Book(String name,Author[] authors ,double price,int qnty){
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.qnty=qnty;
		
	}
	public String getName(){
		return this.name;
	}
	public Author[] getAuthor(){
		return this.authors;
	}
	public double getPrice(){
		return this.price;
	}
	public double setPrice(double price){
		this.price=price;
		return this.price;
	}
	public int getQnty(){
		return qnty;
	}
	public int setQnty(int qnty){
		this.qnty=qnty;
		return this.qnty;
	}
	public String toString(){
		return ("Book[name="+name+",authors=[ "+authors[0].toString()+", "+authors[1].toString()+", Price = "+price+", Quantity="+qnty);
	}
	public Author[] getAuthorNames(){
		return authors;

	}
}
public class Task2{
	public static void main(String[] args) {
	
		Author author1=new Author("robert loafre","loafre.robert123gmail.com",'M');
		Author author2=new Author("IMTIAZ AHMED","imtiazahmedburiro@gmail.com",'M');
		Author[] authors={author1,author2};
		Book b1=new Book("c++",authors,300.5,2);
		System.out.println("Name: "+b1.getName());
		System.out.println("Author names: "+b1.getAuthor());
		System.out.println("Price: "+b1.getPrice());
		System.out.println("Price is: "+b1.setPrice(300.25));
		System.out.println("Quantity: "+b1.getQnty());
		System.out.println(b1.toString());
		b1.getAuthorNames();
	}
}