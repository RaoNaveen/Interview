package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	static int visited[] = new int[4];
	static int arr[][] = {	{0, 1, 1, 0}, 
							{1, 1, 1, 1}, 
							{1, 1, 0, 0},
							{0, 1, 1, 0}};
	public static void main(String[] args) {
		bfs(2);
	}
	
	private static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.println(vertex);
			visited[vertex] = 1;
			for (int j = 0; j < 4; j++)
				if (!queue.contains(j) && visited[j] == 0 && arr[i][j] == 1)
					queue.add(j);
		}
	}
	
	private static void bfs2(int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.println(vertex);
			for (int j = 0; j < 4; j++)
				if (visited[j] == 0 && arr[i][j] == 1) {
					queue.add(j);
					visited[j] = 1;
				}
		}
	}
}
