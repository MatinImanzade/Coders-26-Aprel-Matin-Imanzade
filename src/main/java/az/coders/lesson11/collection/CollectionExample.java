package az.coders.lesson11.collection;

import java.util.HashSet;

public class CollectionExample {


    public static void main(String[] args) {

        HashSet<String > hsh = new HashSet<>();
        hsh.add("a");
        hsh.add("b");
        hsh.add("a");

        System.out.println(hsh);
    }
}
