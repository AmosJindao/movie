package tests.jdk8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListInfo {
//	List<String> list = new ArrayList<>();
	MyStringList list = new MyStringList();
	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");
		
		//use java8 foreach to copy all list elements into the array
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//		list.forEach((value)->{
//			System.out.println(value);
//		});
	}
}
