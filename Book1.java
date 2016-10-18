

public class Book1{

		

	
	private String title, isbn;
	private double price;
	private int pages;
	
	
	public Book1(){
		
		title="No Title";
		isbn="No ISBN";
		price=0.0;
		pages=0;
		
	}
	
	public Book1(String title, String isbn, double price, int pages){
		
		setTitle(title);
		setIsbn(isbn);
		setPrice(price);
		setPages(pages);
		
	}	
	
		//Mutator Method

	public void setTitle(String title){
		this.title=title;
							}
	public void setIsbn(String Isbn){
		this.isbn=isbn;
							}
	public void setPrice(double price){
		this.price=price;
							}
	public void setPages(int pages){
		this.pages=pages;
							}
	
	
	//Accessor Method
	
	
	public String getTitle(){
		return title;
						}
	
	public String getIsbn(){
		return isbn;
						}
	
	public double getPrice(){
		return price;
						}
	
	public int getPages(){
		return pages;
					}
	/** gets the title and details of book
	 **@return the String title
	 ***/
	
	
	public String toString (){
		return "Title: "+getTitle()+"\nISBN: "+getIsbn()+"\nPrice: "+getPrice()+"\nNumber of Pages: "+getPages();		
						}
}	
