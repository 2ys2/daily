import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		boolean[][] bool = new boolean[100][100];
		//Arrays.fill(bool, false);

		int x = 0;
		int y = 0;
		int cnt = 0;
		for (int k = 0; k < N; k++ ) {
			st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());

			for (int i = x; i < x+10; i++ ) {
				for (int j = y; j < y+10; j++ ) {
					if (bool[i][j] == true) {
						continue;
					}
					bool[i][j] = true;
					cnt ++;
				}
			}
		}
		System.out.println(cnt);
	}
}
