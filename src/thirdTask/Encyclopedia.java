package thirdTask;

/**
 * Created by Алексей on 02.03.2017.
 */
public class Encyclopedia extends Book {

    public Encyclopedia(String name, String author, int year){
        super(name, author, year, Books_Type.Encyclopedia);
    }

    @Override
    public void add_Book(){
        books.add(this);
    }
    @Override
    public void add_Book(String name, String author, int year){
        books.add(new Encyclopedia(name, author, year));
    }

    @Override
    public void delete_Book(){
        books.remove(this);
    }
    /*@Override
    public  void delete_All_Books(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            Book temp = iter.next();
            if(temp.book_Type == book_Type && temp.year == year)
                temp.delete_Book();
        }
    }*/
    //@Override
    public String get_Book()
    {
        return this.name + " - " + this.author;
    }
}
