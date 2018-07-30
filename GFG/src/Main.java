import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int arr[] = {6, 1, 7, -10, 3};
		int k = 7;
		Main obj = new Main();
		//obj.subArray(arr, k);
		// System.out.println(obj.subarraySum(arr, 7));
		obj.subArrayWithPositiveNumber(arr, k);
	}

	private void subArrayWithPositiveNumber(int[] arr, int k) {
		int start=0;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			while(sum>k) {
				sum-=arr[start];
				start++;
			}
			if(sum==k)
				System.out.println(start+" "+i);
		}
	}

	public int subarraySum(int[] nums, int k) {
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

	public void subArray(int[] arr, int k) {
		int sum = 0;
		Map<Integer, Integer> set = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == k) {
				System.out.println("0 " + i);
			}
			if (set.containsKey(sum - k))
				System.out.println(set.get(sum - k) + 1 + " " + i);
			set.put(sum, i);
		}
	}
}