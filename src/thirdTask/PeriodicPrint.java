package thirdTask;

/**
 * Created by Алексей on 07.03.2017.
 */
public class PeriodicPrint extends Book{
    /*
    * Constructor for Catalog Book type,
    * cause Catalog extends Book class, we have to use super
    * for launching Book constructor, but here Book_Type is Catalog for
    * all books created with this constructor
    * */
    public PeriodicPrint(String name, String author, int year){
        super(name, author, year, BooksType.PeriodicPrint);
    }
    /*
    * Edition Interface realisation
    * adding current book to a global collection
    * */
    @Override
    public void addBook(){
        books.add(this);
    }
    /*
    * Edition Interface realisation
    * creating a new book, but with the same properties
    * and adding it to a global collection
    * */
    @Override
    public void addBook(String name, String author, int year){
        books.add(new PeriodicPrint(name, author, year));
    }
    /*
    * Edition Interface realisation
    * deleting current book from global collection
    * */
    @Override
    public void deleteBook(){
        books.remove(this);
    }
    /*
    * Edition Interface realisation
    * deleting all books, created in the same year
    * */
    /*@Override
    public  void deleteAllBooks(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            Book temp = iter.next();
            if(temp.bookType == bookType && temp.year == year)
                temp.deleteBook();
        }
    }*/
    /*
    * Edition Interface realisation
    * getter for current book
    * returns one formatted string with name and author
    * */
    //@Override
    public String getBook()
    {
        return this.name + " - " + this.author;
    }
    public final String info(){
        return this.name + " - " + this.author;
    }
}
