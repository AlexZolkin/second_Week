import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import thirdTask.Catalog;
import thirdTask.Encyclopedia;
import thirdTask.PeriodicPrint;

import static thirdTask.Edition.books;

/**
 * Created by Алексей on 07.03.2017.
 */
public class BookTaskTest {
    @BeforeClass
    public static void setUp(){
        for(int i=0;i<10;i++){
            switch (i % 3){
                case 0:
                    new Catalog("Catalog #" + i,"Author #" + i, i + 1950).addBook();
                    break;
                case 1:
                    new Encyclopedia("Encyclopedia #" + i,"Author #" + i, i + 1950).addBook();
                    break;
                case 2:
                    new PeriodicPrint("PeriodicPrint #" + i,"Author #" + i, i + 1950).addBook();
                    break;
            }
        }
    }
    @Test
    public void testDeleteBook(){
        books.get(1).deleteBook();
        Assert.assertEquals("PeriodicPrint",((PeriodicPrint)books.get(1)).info().split(" ")[0]);
    }

    @Test
    public void testAddBook(){
        //new Catalog("Const 1","Const 1",1).add_Book();
        new Catalog("Const 1", "Const 1", 1).addBook("Const 2", "Const 2", 2);
        Catalog tmp = (Catalog) books.get(10);

        Assert.assertEquals("Const 2 ",tmp.getBook().split("-")[0]);

    }
}
