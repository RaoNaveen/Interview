package graph;

public class BFSTest {

	static int visited[] = new int[4];
	static int arr[][] = {	{0, 1, 1, 0}, 
							{1, 0, 1, 1}, 
							{1, 1, 0, 0},
							{0, 1, 1, 0}};
	public static void main(String[] args) {
		bfs(1);  //starting index
}
	private static void bfs(int i) {
		visited[i]=0;
		System.out.println(i);
		for(int j=0;j<visited.length;j++) {
			if(j!=i && visited[j]==0 && arr[i][j]==1) {
				System.out.println(j);
				visited[j]=1;
			}
		}
	}
}
