package rank;

public class PrintParenthesis {
	static void parenthesesBalanced(char str[], int position, int n,
			int openParenthesis, int closeParenthesis) {
		if (closeParenthesis == n) {
			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		} else {
			if (openParenthesis > closeParenthesis) {
				str[position] = '}';
				parenthesesBalanced(str, position + 1, n, openParenthesis,
						closeParenthesis + 1);
			}
			if (openParenthesis < n) {
				str[position] = '{';
				parenthesesBalanced(str, position + 1, n, openParenthesis + 1,
						closeParenthesis);
			}
		}
	}

	static void printParenthesis(char str[], int n) {
		if (n > 0)
			parenthesesBalanced(str, 0, n, 0, 0);
		return;
	}

	public static void main(String[] args) {
		int n = 3;
		char[] str = new char[2 * n];
		printParenthesis(str, n);
	}
}
