package generics;

class A<T>{
	T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}


public class HelloGenerics {

	public static void main(String[] args) {
		A<Integer> a=new A<Integer>();
		a.set(2);
		System.out.println(a.get());
		A<String> s=new A<String>();
		s.set("naveen");
		System.out.println(s.get());
	}
}
