package firstTask;

/**
 * Created by Алексей on 17.03.2017.
 */
public interface IArrayList<T> {
    void add(T item) throws IndexOutOfBoundsException;
    void add(int index, T item) throws IndexOutOfBoundsException;

    T get(int index) throws IndexOutOfBoundsException;
    int size();
    void clear();

    void remove(int index) throws IndexOutOfBoundsException;
    void remove(int index, T item) throws IndexOutOfBoundsException;
    void set(int index, T item) throws IndexOutOfBoundsException;

    boolean contains(T item);
}
