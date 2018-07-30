package O;

public class StringReplace {

	public static int compress(char[] chars) {
		int anchor = 0, write = 0;
		for (int read = 0; read < chars.length; read++) {
			if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
				chars[write++] = chars[anchor];
				if (read > anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray()) {
						chars[write++] = c;
					}
				}
				anchor = read + 1;
			}
		}
		return write;
	}

	public static void main(String[] args) {

		String str = "aaabbbc";
		System.out.println(compress(str.toCharArray()));
		int count = 1;
		int index = 0;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 == arr.length || arr[i + 1] != arr[i]) {
				arr[index++] = arr[i];
				for (char c : ("" + count).toCharArray())
					arr[index++] = c;
				count = 1;
			} else {
				count++;
			}
		}
		for (char c : arr)
			System.out.print(c);

	}
}
