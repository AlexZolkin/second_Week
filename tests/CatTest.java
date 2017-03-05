import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import secondTask.Cat;

/**
 * Created by Алексей on 05.03.2017.
 */


public class CatTest {
    @Before
    public void setUp(){
        for(int i=0; i<10; i++){
            Cat.cats.add(new Cat("Cat# " + i));
        }
    }

    @Test
    public void catsTest(){
        Assert.assertEquals("Cat# 1",Cat.cats.get(1).catName);
    }
}
