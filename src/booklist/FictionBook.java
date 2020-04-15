package booklist;

public class FictionBook extends Book{
    private String category;
    public FictionBook(){};
    public FictionBook(String name, int price, String category, String author){
        super(name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String display(){
        return super.display() + ". Category is: " + getCategory();
    }
}
