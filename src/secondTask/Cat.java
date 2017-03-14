package secondTask;

import java.util.ArrayList;

/**
 * Created by Алексей on 05.03.2017.
 */
/*
* represent's cat's as object's of class Cat
* */
public class Cat {
    public String catName;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat(String catName){
        this.catName = catName;
    }

}
