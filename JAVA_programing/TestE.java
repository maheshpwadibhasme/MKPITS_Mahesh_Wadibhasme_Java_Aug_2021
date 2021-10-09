//create a class Book having private fields title and author and methods(setter and getter methods)
//setTitle(),setAuthor and getTitle() and getAuthor();
class Book{
	private String title;
	private String author;

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
class TestE{
	public static void main(String[] args){
		Book t=new Book();
		t.setTitle("java");
		System.out.println("Title of book ="+t.getTitle());

		t.setAuthor("martin");
		System.out.println("Author of book ="+t.getAuthor());
		}
}