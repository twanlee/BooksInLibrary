package booklist;

public class ProgramingBook extends Book{
    private String language;
    private String framework;
    public ProgramingBook(){};
    public ProgramingBook(String name, int price, String author, String language, String framework){
        super(name,price,author);
        this.framework = framework;
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public String display(){
        return super.display() + ". Framework is: " + getFramework()+". Language is: " + getLanguage();
    }
}
