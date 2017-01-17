package tests.jdk8.lamdba;

import tests.random.RandomIntTest;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created on 2017/1/17.
 */
public class ForEachThrowEx {
    public static void main(String[] args) {
        List<Integer> lst = RandomIntTest.genIds();
        
        final AtomicInteger num = new AtomicInteger(0);
        try {
            lst.forEach(it -> {
                if (it > 10 && it < 30) {
                    throw new RuntimeException("problem!");
                }
                num.getAndIncrement();
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("size:"+lst.size()+", num:"+num.get());
    }
    
   
}
