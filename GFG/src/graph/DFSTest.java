package graph;

public class DFSTest {

	static int visited[] = new int[4];
	static int arr[][] = {	{0, 1, 1, 0}, 
							{1, 0, 0, 0}, 
							{1, 1, 0, 0},
							{0, 1, 1, 0}};
	public static void main(String[] args) {
		dfs(3);
	}
	private static void dfs(int i) {
		visited[i]=1;
		System.out.println(i);
		for(int j=0;j<visited.length;j++) {
			if(arr[i][j]==1 && visited[j]==0)
				dfs(j);
		}
	}
}
