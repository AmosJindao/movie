package tests.random;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2016-11-20
 */
public class RandomIntTest{
    public static void main(String[] args) {
        IntStream ints = new Random().ints(6,0,100);

//        ints.

        ints.forEach(i->{
            System.out.println(i);
        });
    }

   public static List<Integer> genIds(){
       return new Random().ints(10, 0, 100).collect(LinkedList::new,(lst,it) ->{
            lst.add(it);
        },(l1, l2)->{
            l1.addAll(l2);
        });
    }
}
