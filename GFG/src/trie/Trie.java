package trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
	public Map<Character, TrieNode> map;
	public boolean endOfWord;
	public TrieNode() {
		map = new HashMap<>();
	}
	@Override
	public String toString() {
		return "TrieNode [map=" + map + ", endOfWord=" + endOfWord + "]";
	}
}

public class Trie {
	TrieNode trie = new TrieNode();
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("na");
		trie.insert("na");
		System.out.println(trie.contains("naveen"));
		System.out.println(trie.startsWith("nav"));
		System.out.println(trie.longestPrefixMatch("nav"));
	}

	private String longestPrefixMatch(String str) {
		String res="";
		Map<Character, TrieNode> map = trie.map;
		for (int i = 0; i < str.length(); i++) {
			TrieNode t;
			if(map.containsKey(str.charAt(i))) {
				res+=str.charAt(i);
				t=map.get(str.charAt(i));
				map=t.map;
			}else
				break;
		}
		return res;
	}

	private boolean startsWith(String str) {
		Map<Character, TrieNode> map = trie.map;
		for (int i = 0; i < str.length(); i++) {
			TrieNode t;
			if (map.containsKey(str.charAt(i))) {
				t = map.get(str.charAt(i));
				map = t.map;
			} else {
				return false;
			}
		}
		return true;
	}

	private boolean contains(String str) {
		Map<Character, TrieNode> map = trie.map;
		for (int i = 0; i < str.length(); i++) {
			TrieNode t;
			if (map.containsKey(str.charAt(i))) {
				t = map.get(str.charAt(i));
				if (i == str.length() - 1 && t.endOfWord)
					return true;
				map = t.map;
			} else
				return false;
		}
		return false;
	}

	private void insert(String str) {
		Map<Character, TrieNode> map = trie.map;
		for (int i = 0; i < str.length(); i++) {
			TrieNode t;
			if (map.containsKey(str.charAt(i))) {
				t = map.get(str.charAt(i));
			} else {
				t = new TrieNode();
				map.put(str.charAt(i), t);
			}
			map = t.map;
			if (i == str.length() - 1)
				t.endOfWord = true;
		}
	}
}
