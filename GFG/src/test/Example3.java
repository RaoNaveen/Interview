package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("raj", 2);
		map.put("navee", 13);
		map.put("sanjeev", 17);
		map.put("naveen", 2);
		
		
		
		TreeMap<String, Integer> treeMap=new TreeMap<>(map);
//		treeMap.forEach((key,value)->System.out.println(key+" "+value));
//		
//		System.out.println();
//		
//		TreeMap<String , Integer> treeMap2=new TreeMap<>((value1,value2)->value1.compareTo(value2));
//		treeMap2.putAll(map);
//		treeMap2.forEach((key,value)->System.out.println(key+" "+value));
//		
//		System.out.println();
		
		TreeSet<Entry<String, Integer>> treeset=new TreeSet<>((a,b)->((a.getValue()-b.getValue())==0?(a.getKey().compareTo(b.getKey())):(a.getValue()-b.getValue())));
		treeset.addAll(map.entrySet());
		treeset.forEach(a->System.out.println(a.getKey()+" "+a.getValue()));
		
//		List<Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
//		Collections.sort(list, (a,b)->(a.getValue()-(b.getValue())));
//		list.forEach((a)->System.out.println(a.getKey()+" "+a.getValue()));
	}
}
