package anaedu_midalg_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class stars {
	
	public static char[][] bg;
	
	public static void rec(int topLeftX, int topLeftY, int squareSize) {
		if (squareSize == 1) {
			bg[topLeftX][topLeftY] = '*';
			return;
		}
		
		int nextSize = squareSize / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) continue;
				rec(i, j, nextSize);
			}
		}
		return;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		bg = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				bg[i][j] = ' ';
			}
		}
		rec(0, 0, size);
		for (int i = 0; i < size; i++) {
			String str = new String(bg[i]);
			bw.write(str);
		}
	}
	
}
