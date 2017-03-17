package firstTask;

/**
 * Created by Алексей on 04.03.2017.
 */
public class ArrayList<T> implements IArrayList<T>{
    private final int INIT_SIZE = 8;
    private int lastItem = 0;
    private int CUT_RATE = 2;
    private Object[] array = new Object[INIT_SIZE];
    /*
    * adding new item to the end of the array
    * */
    @Override
    public void add(T item) throws IndexOutOfBoundsException{
        add(lastItem, item);
    }
    /*
    * adding item in index position
    * all elements to the right has to be shifted
    * lastItem index increases
    * array doubles it's length, if end reached
    * */
    @Override
    public void add(int index,T item) throws IndexOutOfBoundsException{
        if(index > lastItem)
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        if(lastItem == array.length - 1)
            resize(array.length * 2);
        for(int i = lastItem - 1;i>index;i--){
            array[i] = array[i-1];
        }
        array[index] = item;
        lastItem++;
    }
    /*
    * getter
    * returns element of array with index given
    * */
    @Override
    public T get(int index) throws IndexOutOfBoundsException{
        if(index >= lastItem)
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        return (T)array[index];
    }
    /*
    * returns lastItem + 1,
    * cause lastItem is index, so it counts from 0
    * */
    @Override
    public int size(){
        return lastItem;
    }
    /*
    * clears collection
    * simply crates new array and replace an old one with it
    * */
    @Override
    public void clear(){
        array = new Object[INIT_SIZE];
    }
    /*
    * delete object in given position in array
    * without comparing check
    * */
    @Override
    public  void remove(int index) throws IndexOutOfBoundsException{
        if(index >= size())
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        remove(index,(T)array[index]);
    }
    /*
    * main method for deleting
    * compares needed item in array with object given as parameter
    * deletes array item, if they are equal
    * left shift is also performed
    * */
    @Override
    public void remove(int index, T item) throws IndexOutOfBoundsException{
        if(index >= lastItem)
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        if(equals((T)array[index],item)){
            for(int i=index;i<lastItem;i++){
                array[i] = array[i+1];
            }
            lastItem--;
            array[lastItem] = null;
        }
        if(array.length > INIT_SIZE && lastItem < array.length / CUT_RATE)
            resize(array.length / 2);
    }
    /*
    * simply replaces needed element of an array with given one
    * */
    @Override
    public void set(int index, T item) throws IndexOutOfBoundsException{
        if(index >= lastItem)
            throw new IndexOutOfBoundsException("Index is out of list bounds");
        array[index] = item;
    }
    /*
    * checks
    * doe's an array contains item given
    * */
    @Override
    public boolean contains(T item){
        for(int i=0;i<lastItem;i++){
            if(equals((T)array[i],item))
                return true;
        }
        return false;
    }
    /*
    * creates new, bigger array
    * copies contains of the old array to the new one
    * allocate old one with new
    * */
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, lastItem);
        array = newArray;
    }
    /*
    * simple function for equality checking
    * address,null,class,hashcode matching test performed
    * */
    private boolean equals(T item1, T item2){
        if(item1 == null || item2 == null)
            return false;
        if(item1 == item2)
            return true;
        if(item1.getClass() != item2.getClass())
            return false;
        if(item1.hashCode() != item2.hashCode())
            return false;
        return true;
    }
}
