package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncTest {
	
	public void method(List<Integer> list) {
		list=Collections.synchronizedList(list);
		synchronized (list) {
			Iterator<Integer> iter=list.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next()+" "+Thread.currentThread().getName());
			}
		}	
	}

	public static void main(String[] args) {
		SyncTest syncTest=new SyncTest();
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Thread t=new Thread(()->syncTest.method(list));
		Thread t2=new Thread(()->syncTest.method(list));
		t.start();
		t2.start();
	}
}
