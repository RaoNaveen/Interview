package hr;

public class Main {

	public static void main(String[] args) {
		int first[] = {2,5,7};
		int second[] = {3,5,8};
		System.out.println(call(first, second, "even"));
	}

	private static String call(int[] andrea, int[] maria, String string) {
		int first = 0;
		int second = 0;
		if (string.equalsIgnoreCase("even")) {
			for (int i = 0; i < andrea.length && i < andrea.length; i++) {
				first += andrea[i] - maria[i];
				second += maria[i] - andrea[i];
			}
		} else {
			for (int i = 1; i < andrea.length && i < maria.length; i++) {
				first += andrea[i] - maria[i];
				second += maria[i] - andrea[i];
			}
		}
		if (first > second)
			return "andrea";
		return "maria";
	}
}
