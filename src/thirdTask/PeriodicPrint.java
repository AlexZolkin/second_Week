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
        super(name, author, year, Books_Type.PeriodicPrint);
    }
    /*
    * Edition Interface realisation
    * adding current book to a global collection
    * */
    @Override
    public void add_Book(){
        books.add(this);
    }
    /*
    * Edition Interface realisation
    * creating a new book, but with the same properties
    * and adding it to a global collection
    * */
    @Override
    public void add_Book(String name, String author, int year){
        books.add(new PeriodicPrint(name, author, year));
    }
    /*
    * Edition Interface realisation
    * deleting current book from global collection
    * */
    @Override
    public void delete_Book(){
        books.remove(this);
    }
    /*
    * Edition Interface realisation
    * deleting all books, created in the same year
    * */
    /*@Override
    public  void delete_All_Books(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            Book temp = iter.next();
            if(temp.book_Type == book_Type && temp.year == year)
                temp.delete_Book();
        }
    }*/
    /*
    * Edition Interface realisation
    * getter for current book
    * returns one formatted string with name and author
    * */
    //@Override
    public String get_Book()
    {
        return this.name + " - " + this.author;
    }
    public final String info(){
        return this.name + " - " + this.author;
    }
}
