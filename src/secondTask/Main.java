package secondTask;


import java.util.Iterator;

/**
 * Created by Алексей on 05.03.2017.
 */
public class Main {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Cat.cats.add(new Cat("Cat# " + i));
        }

        Iterator<Cat> iter = Cat.cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().catName);
        }
    }
}
