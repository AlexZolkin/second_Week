import firstTask.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
/**
 * Created by Алексей on 04.03.2017.
 */
public class ArrayListTest {
    ArrayList<Object> list;
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Object>();
        list.add(new Object());
        list.add(2);
        list.add(new Object());
    }

    @Test
    public void add() throws Exception {
        list.add(new Object());
        list.add(2);
        list.add(new Object());

        Assert.assertEquals(2, list.get(1));
    }

    @Test
    public void remove() throws Exception {
        list.remove(1);
        Assert.assertNotEquals(2,list.get(1));
    }

    @Test
    public void set() throws Exception {
        list.set(1,10);
        Assert.assertEquals(10, list.get(1));
    }

    @Test
    public void contains() throws Exception {
        list.set(0,15);
        Assert.assertEquals(true,list.contains(15));
    }

}