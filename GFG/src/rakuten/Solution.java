package rakuten;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(1220));
	}
	public int solution(int N) {
		if (N == 0)
			return 1;
		int zeroCounter = 0;
		String str = String.valueOf(N);
		int length = str.length();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (c == '0')
				zeroCounter++;
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else {
				map.put(c, 1);
			}
		}
		int lowerValue = 1;
		for (char key : map.keySet()) {
			if (key != '0' && !map.get(key).equals(1))
				lowerValue *= findFactorial(map.get(key));
		}

		int upperValue = findFactorial(length - zeroCounter)*(zeroCounter+1);
		return upperValue / lowerValue;
	}

	public static int findFactorial(int n) {
		if (n <= 1)
			return 1;
		else
			return n * findFactorial(n - 1);
	}

}