class Book1{
	private int id;
	private String title;
	private String author;

	public void setId(int id){
		if(id>100){
			this.id=id;
	}else{
		System.out.println("ID should be grater then 100");
	}
	}
	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}

	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
}
class TestB{
	public static void main(String[] args){
		Book1 b=new Book1();
		b.setId(1);
		System.out.println("Book Id is = "+b.getId());

		b.setTitle("java");
		System.out.println("Book Title is = "+b.getTitle());

		b.setAuthor("martin");
		System.out.println("book Author is = "+b.getAuthor());
	}
}