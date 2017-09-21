package tests.equals;

import java.util.LinkedList;
import java.util.List;

/**
 * @author amos
 * @date 2017-09-18
 */
public class Equals{

    private String name;
    public Equals(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }

    public static void main(String[] args) {
        Equals a1 = new Equals("aa");
        Equals a2 = new Equals("aa");

        List<Equals> ll = new LinkedList<>();


        System.out.println(a1.equals(a2));

        ll.add(a1);

        System.out.println(ll.contains(a2));


    }
}
