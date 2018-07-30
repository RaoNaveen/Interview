package gs;

import java.util.HashMap;
import java.util.Map;

public class First {

	public static void main(String[] args) {
		int arr[][] = {{38, 13, 5}, {21, 28, 18}, {13, 12, 15}};
		for(int i:findTruckCargo(30, arr)){
			System.out.println(i);
		}
	}

	static int[] findTruckCargo(int maxCargoWeight, int[][] cargoList) {
		int finalRes[] = new int[3];
		int weight[] = new int[cargoList.length];
		int profit[] = new int[cargoList.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < cargoList.length; i++) {
			weight[i] = cargoList[i][1];
			profit[i] = cargoList[i][2];
			map.put(cargoList[i][2], cargoList[i][0]);
		}
		int res[][] = new int[weight.length + 1][maxCargoWeight + 1];
		for (int i = 0; i <= profit.length; i++) {
			for (int j = 0; j <= maxCargoWeight; j++) {
				if (i == 0 || j == 0) {
					res[i][j] = 0;
				} else if (weight[i - 1] <= j) {
					res[i][j] = Math.max(
							profit[i - 1] + res[i - 1][j - weight[i - 1]],
							res[i - 1][j]);
				} else {
					res[i][j] = res[i - 1][j];
				}
			}
		}
		int k = finalRes.length - 2;
		int i = res.length - 1;
		int j = res[0].length - 1;
		while (i > 0 && j > 0) {
			if (res[i][j] == res[i - 1][j]) {
				--i;
			}
			else {
				finalRes[k] = map.get(res[i][j]-res[i-1][j-weight[i-1]]);
				i--;
				j=j-weight[i-1];
				k--;
			}
		}
		finalRes[finalRes.length-1]=res[res.length-1][res[0].length-1];
		return finalRes;
	}
}

// static int nonRepeatingDigitProductCount(int x, int y, int z) {
// int count = 0;
// for (int i = y; i <= z; i++) {
// int mult = x * i;
// Set<Integer> set = convertIntoSet(i);
// if (!checkInMult(mult, set)) {
// count++;
// }
// }
// return count;
// }
//
// public static boolean checkInMult(int mult, Set<Integer> set) {
// if(mult==0) {
// if(set.contains(mult))
// return true;
// return false;
// }
// while (mult > 0) {
// int rem = mult % 10;
// mult = mult / 10;
// if (set.contains(rem))
// return true;
// }
// return false;
// }
// public static Set<Integer> convertIntoSet(int y) {
// Set<Integer> set = new HashSet<>();
// if (y == 0) {
// set.add(0);
// return set;
// }
// while (y > 0) {
// set.add(y % 10);
// y = y / 10;
// }
// return set;
// }
