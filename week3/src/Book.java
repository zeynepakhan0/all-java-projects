
public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;

public String getTitle() {
    return this.title;
}
public void setTitle(String title) {
    this.title=title;
}
public String getAuthor() {
    return this.author;
}
public void setAuthor(String author) {
    this.author=author;
}
public int getIsbn() {
    return this.isbn;
}
public void setIsbn(int isbn) {
    this.isbn=isbn;
}
public boolean getAvailable() {
    return this.isAvailable;
}
public void setAvailable(boolean isAvailable) {
    this.isAvailable=isAvailable;
}
    public Book(String title, String author, int isbn) {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=true;
    }

public void borrowBook() {
    if(isAvailable) {
        isAvailable=false;
        System.out.println("Book is borrowed:" +title);
    } else{
        System.out.println("Book is already borrowed:" +title);
    }
}

public void returnBook() {
    if(isAvailable==false) {
        isAvailable=true;
    }
}

public String toString() {
    return "Title:" +title +" " +"Author:" +author +" " +"ISBN:" +isbn +" " +"Available:" +isAvailable;
}
    public static void main(String[] args) {



    }
}