package interfaces.products;

public class Book implements Product {

    private String name;
    private String author;
    private int pages;
    private String isbn;
    
    // Name getter and setter
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    // Author getter and setter
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    // Pages getter and setter
    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    // Isbn getter and setter
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}
