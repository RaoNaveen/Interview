package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
	List<Integer> list;
	public MyCallable(List<Integer> list) {
		this.list = list;
	}
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

}

public class MultOfList {

	public static void main(String[] args) {
		int mult=1;
		ExecutorService executor=Executors.newFixedThreadPool(5);
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2));
		List<Integer> list2=new ArrayList<>(Arrays.asList(1,2));
		List<Integer> list3=new ArrayList<>(Arrays.asList(1,2));
		List<Integer> list4=new ArrayList<>(Arrays.asList(1,2));
		List<Integer> list5=new ArrayList<>(Arrays.asList(1,2));
		List<List<Integer>> mainList=new ArrayList<List<Integer>>();
		mainList.add(list);
		mainList.add(list2);
		mainList.add(list3);
		mainList.add(list4);
		mainList.add(list5);
		for(List<Integer> li:mainList) {
			Future<Integer> future=executor.submit(new MyCallable(li));
			try {
				mult*=future.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(mult);
	}
}
