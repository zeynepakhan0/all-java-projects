public class BookProduct extends Product{
    private String author;
    private String genre;
    private int numOfPages;

    public BookProduct(int id, String name, double price, String description,String author, String genre, int numOfPages) {
        super(id,name,price,description);
        this.author = author;
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

public String getAuthor() {
        return author;
}
public String getGenre(){
        return genre;
}
public int getNumOfPages(){
        return numOfPages;
}

public double getTax(){
        return getPrice()*(0.08);
}
public String toString(){
        return super.toString()+ "author:" + author+ "genre:" + genre+ "numOfPages:" + numOfPages;
}

}
