package bfs;

import java.io.*;
import java.util.*;

class Point {
	int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class BFS {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] array = new char[N][];
		
		for (int i = 0; i < N; i++)
			array[i] = br.readLine().toCharArray();
		
		int[][] step = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		
		Queue<Point> qu = new LinkedList<>();
		
		visited[0][0] = true;
		step[0][0] = 1;
		qu.add(new Point(0, 0));
		
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		
		while(!qu.isEmpty()) {
			Point p = qu.poll();
			
			for (int i = 0; i < 4; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				
				if (x >= 0 && x < N && y >= 0 && y < M) {
					if (!visited[x][y] && array[x][y] == '1') {
						visited[x][y] = true;
						step[x][y] = step[p.x][p.y] + 1;
						qu.add(new Point(x, y));
					}
				}
			}
		}
		
		bw.write(step[N-1][M-1] + "\n");
		bw.flush();
		bw.close();
	}

}
