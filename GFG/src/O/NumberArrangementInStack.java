package O;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberArrangementInStack2 {
	public static void main(String[] args) {
		String arr[] = new String[10];
		int pointer = 0;
		for (int valueToPlace = 1; valueToPlace <= arr.length; valueToPlace++) {
			for (int x = 1; x <= valueToPlace; x++) {
				if (pointer == arr.length - 1)
					pointer = 0;
				else
					pointer++;
				if (arr[pointer] != null)
					x--;
			}
			System.out.println(
					"Placing " + valueToPlace + " at index " + pointer);
			arr[pointer] = valueToPlace + "";
			while (arr[pointer] != null && valueToPlace != arr.length) {
				if (pointer == arr.length - 1)
					pointer = 0;
				else
					pointer++;
			}
		}
		for (String str : arr) {
			System.out.print(str + ", ");
		}
	}
}

class NumberArrangementInStack{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		List<String> list=new ArrayList<String>(Arrays.asList(""));
		NumberArrangementInStack ob=new NumberArrangementInStack();
		ob.clone();

		int arr[] = new int[10];
		int countNonZero = 0;
		int loopCount = 0;
		int skip = 1;
		int index = -1;
		while (true) {
			index = index + skip + 1;
			if (index >= 10) {
				loopCount++;
				index = (index + countNonZero) % 10;
			}
			arr[index] = skip;
			skip++;
			countNonZero++;
			if (countNonZero == 10)
				break;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}