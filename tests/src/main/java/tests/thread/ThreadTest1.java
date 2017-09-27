package tests.thread;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * two threads, thread A generates 5 random numbers per second, the number range is [0,100].
 * While thread B reads the A-produced numbers every two seconds, and sorts then prints out.
 * <p>
 * Created by liushengri on 2017/3/23.
 */
public class ThreadTest1 {
    static java.util.Queue<Integer> sque = new LinkedList<>();

    public static void main(String[] args) {
        new Thread(new ThreadA()).start();
        new Thread(new ThreadB()).start();
       
    }

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }

                Random rd = new Random();
                
                for(int i=0; i<5; i++){
                    sque.offer(rd.nextInt(101));
                }
            }
        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                }

                List<Integer> numList = new LinkedList<>();
                
                Integer tmpNum = sque.poll();
                while (tmpNum != null){
                    numList.add(tmpNum);
                    
                    tmpNum = sque.poll();
                }

                Integer[] numArr = new Integer[numList.size()];
                
                Arrays.sort(numList.toArray(numArr));

                for(Integer tmp:numArr) {
                    System.out.print(tmp+"\t");
                }

                System.out.println();
                System.out.println();
            }
        }
    }
}
