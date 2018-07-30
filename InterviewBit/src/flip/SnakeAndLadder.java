package flip;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SnakeAndLadder {

	static class EntryQueue {
		int v;
		int dist;
		@Override
		public String toString() {
			return "EntryQueue [v=" + v + ", dist=" + dist + "]";
		}
	}
	
	public static void main(String[] args) {
		Map<String, Boolean> map=new HashMap<>();
		int N = 30;
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = -1;
		}
		arr[1] = 22;
		arr[2] = 23;
		System.out.println(MinStep(arr, N));
	}

	private static int MinStep(int[] arr, int n) {
		int visited[] = new int[n];
		Queue<EntryQueue> queue = new LinkedList<>();
		EntryQueue entry = new EntryQueue();
		entry.v = 0;
		entry.dist = 0;
		visited[0]=1;
		queue.add(entry);
		while (!queue.isEmpty()) {
			entry = queue.remove();
			int v = entry.v;

			if (v == n - 1)
				break;

			for (int i = v + 1; i <= (v + 6) && i < n; i++) {
				
				if(visited[i]==0) {
					visited[i]=1;
					EntryQueue temp=new EntryQueue();
					temp.dist=(entry.dist+1);
					if(arr[i]!=-1) {
						temp.v=arr[i];
					}else {
					temp.v=i;
					}
					queue.add(temp);
				}
			}
		}
		return entry.dist;
	}
}
