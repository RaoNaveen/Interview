package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Example {

	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (a, b) ->
		{
			try {
				biConsumer.accept(a, b);
			} catch (Exception e) {
				System.out.println("Exception");
			}
		};
	}

	public void check(BiConsumer<Integer, Integer> biConsumer) {
		int key = 2;
		for (int i = 0; i < 4; i++)
			biConsumer.accept(i, key);
	}

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		List<String> list2 = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "5"));
		// Example ex = new Example();
		// ex.check(wrapperLambda((a, b) -> System.out.println(a / b)));
		// list.stream().sorted((a, b) -> a - b).forEach(System.out::println);
//		System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
//		Optional<String> optional = list2.stream().reduce((a, b) -> a + "#" + b);
//		optional.ifPresent(System.out::println);
//
//		Map<String, String> map = new HashMap<>();
//		list2.forEach((x) -> map.putIfAbsent(x, "val"+x));
//		map.forEach((x,y)->System.out.println(y));
//		
//		
//		map.computeIfPresent("2", (a,b)->a+b);
//		System.out.println(map.get("2"));
//		
//		list.stream().filter(s->{
//			System.out.println("filter "+s);
//			return s%2==0;
//		}).forEach(a->System.out.println("for each "+a));
//		
//		list.stream().anyMatch(a->a%2==0);
//		
//		Supplier<Stream<String>> streamSupplier=()->Stream.of("a","b","ac");
//		
//		System.out.println(streamSupplier.get().anyMatch(a->a.startsWith("a")));
		
		List<Person> list=Arrays.asList(new Person("Naveen", 23),new Person("Maonj", 23),new Person("Vjay", 18),new Person("Sajbb", 29),new Person("Sazy", 29));
		System.out.println(list.stream().filter(p->p.age>20).collect(Collectors.maxBy((p,q)->p.name.compareTo(q.name))));
		
		list.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2);
		//Map<Integer,List<Person>> groupByAge=list.stream().filter(p->p.age>20).collect(Collectors.joining());
		
		///groupByAge.forEach((age,name)->System.out.println(age+" "+name));
		
		
		TreeMap<Person, Integer> map=new TreeMap<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}