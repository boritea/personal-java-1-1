package anaedu_midalg_02;

import java.io.*;
import java.util.*;

public class CutDown {
	
	public static long[] tree;
	
	public static long getTree(long height) {
		long result = 0;
		for (long tall : tree) result += Math.max(0, tall - height);
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		tree = new long[N];
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		
		int left = 0, right = (int) 1e9;
		
		while (right - left != 1) {
			int mid = (left + right) / 2;
			
			if (getTree(mid) >= M) left = mid;
			else right = mid;
		}
		
		System.out.println(left);
		
	}
	
}
