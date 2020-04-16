package booklist;

public class Book {
    private String name;
    private int price;
    private String author;
    private int bookCode;
    static int code = 0;
    public Book(){};
    public Book(String name, int price, String author){
        this.author = author;
        this.name = name;
        this.price = price;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCode(){
        bookCode = code;
        code ++;
    }
    public int getCode(){
        return bookCode;
    }
    public String display(){
        return "A Book code " +getCode()+" has name: " + getName()+ " and Price " + getPrice() + " of author "+getAuthor();
    }
}
