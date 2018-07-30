package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class TrieNode {
	int NO_OF_CHARS = 26;
	TrieNode[] children = new TrieNode[NO_OF_CHARS];
	boolean endOfWord;

	public TrieNode() {
		endOfWord = false;
		for (int i = 0; i < children.length; i++) {
			children[i] = null;
		}
	}

	@Override
	public String toString() {
		return "TrieNode [NO_OF_CHARS=" + NO_OF_CHARS + ", children="
				+ Arrays.toString(children) + ", endOfWord=" + endOfWord + "]";
	}
}

public class WordBoggle {

	TrieNode root=new TrieNode();
	public static void main(String[] args) {
		WordBoggle wordboggle = new WordBoggle();
		List<String> dictionary = new ArrayList<String>(
				Arrays.asList("GEEKS", "QUIZ", "GO", "TEZ"));
		char boggle[][] = {{'G', 'I', 'Z'}, {'U', 'E', 'K'}, {'Q', 'S', 'E'}};
		wordboggle.createTrie(dictionary);
	}

	private void insert(String string) {
		int level;
		int index;
		TrieNode ptr = root;
		for (level = 0; level < string.length(); level++) {
			index = string.charAt(level) - 'A';
			if (ptr.children[index] == null)
				ptr.children[index] = new TrieNode();
			ptr = ptr.children[index];
		}
		ptr.endOfWord = true;
	}

	private void createTrie(List<String> dictionary) {
		for (Iterator iterator = dictionary.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			insert(string);
		}
		System.out.println(search("GEEKS"));
	}

	private boolean search(String string) {
		int level;
		int index;
		TrieNode ptr=root;
		for(level=0;level<string.length();level++) {
			index=string.charAt(level)-'A';
			if(ptr.children[index]==null)
				return false;
			ptr=ptr.children[index];
		}
		if(ptr.endOfWord)
			return true;
		return false;
	}
}
