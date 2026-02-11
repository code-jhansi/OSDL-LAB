
/*Create a Book class with private data members including book ID, book title, 
author name, price, and availability status. Provide public setter methods to assign 
values to these data members and public getter methods to retrieve their values. 
Include validation in setter methods to ensure that the price is a positive value.*/


class Book{
    private int bookid;
    private String booktitle;
    private String authorname;
    private float price;
    private String availabilitystatus;

    //setter methods
    public void setBookId(int bookid){
        this.bookid=bookid;
    }
    public void setBookTitle(String booktitle){
    this.booktitle=booktitle;
    }
    public void setAuthorName(String authorname){
        this.authorname=authorname;
    }
    public void setPrice(float price){
    if(price>0){
        this.price=price;
    }
    else{
        System.out.println("Invalid price");
    }
    }
    public void setAvailabilityStatus(String availabilitystatus){
        this.availabilitystatus=availabilitystatus;
    }
    //getter methods
    public int getBookId(){
        return bookid;
    }
    public String getBookTitle(){
        return booktitle;
    }
    public String getAuthorName(){
        return authorname;
    }
    public float getPrice(){
        return price;
    }
    public String getAvailabilityStatus(){
    return availabilitystatus;
    }

}
public class lab1q1 {
    public static void main(String[] args){
        Book b = new Book();
        b.setBookId(101);
        b.setBookTitle("Java Basics");
        b.setAuthorName("James Gosling");
        b.setPrice(500);
        b.setAvailabilityStatus("Available");
        
        System.out.println("Book ID: " + b.getBookId());
        System.out.println("Book Title:" + b.getBookTitle());
        System.out.println("Author:" + b.getAuthorName());
        System.out.println("Price:" + b.getPrice());
        System.out.println("Status:" + b.getAvailabilityStatus());
    }
}
