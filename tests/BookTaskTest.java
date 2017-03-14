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
                    new Catalog("Catalog #" + i,"Author #" + i, i + 1950).add_Book();
                    break;
                case 1:
                    new Encyclopedia("Encyclopedia #" + i,"Author #" + i, i + 1950).add_Book();
                    break;
                case 2:
                    new PeriodicPrint("PeriodicPrint #" + i,"Author #" + i, i + 1950).add_Book();
                    break;
            }
        }
    }
    @Test
    public void testDeleteBook(){
        books.get(1).delete_Book();
        Assert.assertEquals("PeriodicPrint",((PeriodicPrint)books.get(1)).info().split(" ")[0]);
    }

    @Test
    public void testAddBook(){
        //new Catalog("Const 1","Const 1",1).add_Book();
        new Catalog("Const 1", "Const 1", 1).add_Book("Const 2", "Const 2", 2);
        Catalog tmp = (Catalog) books.get(10);

        Assert.assertEquals("Const 2 ",tmp.get_Book().split("-")[0]);

    }
}
