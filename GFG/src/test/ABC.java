package test;

import java.util.HashMap;

class Key {
	int i;
	public Key(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		return 200;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (i != other.i)
			return false;
		return true;
	}
}

public class ABC {
	public static void main(String[] args) {
		HashMap<Key, Integer> map = new HashMap<>();
		for (int i = 0; i < 20; i++) {
			map.put(new Key(i), i);
		}
		System.out.println(map.size());
	}
}
