import java.util.ArrayList;
public class Library {

    ArrayList<Book> books;

   public Library() {

       books=new ArrayList<>();
    }

    public void addBook(Book book) {
       books.add(book);
    }

    public void borrowBook(int isbn) {
     for(int i=0;i<books.size();i++) {
         if(books.get(i).getIsbn()==isbn) {
             if(books.get(i).getAvailable()){
                 books.get(i).borrowBook();
                 return;
            } else{
                 System.out.println("Book is already borrowed");
             }
         }
     } }

    public void returnBook(int isbn){
         for(int i=0;i<books.size();i++) {
             if(books.get(i).getIsbn()==isbn) {
                 if(!books.get(i).getAvailable()){
                     books.get(i).returnBook();
                     System.out.println("Book is returned");
                     return;
                 }
                 }
             }
         }

    public void listAvailableBooks(){

        System.out.println("List of available books is:");
         for(int i=0;i<books.size();i++) {
             if(books.get(i).getAvailable()) {
                 System.out.println(books.get(i));
             }
         }
     }

    public void removeBooks(int isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn() == isbn) {
                books.remove(books.get(i));
                return;
            }
        }
    }


    public static void main(String[] args){

    Book book1= new Book("Mai ve Siyah", "Halit Ziya Usakligil", 1);
    Book book2= new Book("Suc ve Ceza", "Fyodor Dostoyevski",2);
    Book book3=new Book("Kurk Mantolu Madonna","Sabahattin Ali",3);
    Library library=new Library();
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.borrowBook(book1.getIsbn());
    library.listAvailableBooks();
    library.borrowBook(book1.getIsbn());
    library.returnBook(book1.getIsbn());
    library.listAvailableBooks();
    library.removeBooks(book2.getIsbn());
    library.listAvailableBooks();



    }




    }



