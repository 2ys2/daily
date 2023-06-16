import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[][] arr2 = new int[N][M];
		int[][] sum = new int[N][M];

			for (int i = 0; i < N; i++ ) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++ ) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					sum[i][j] = arr[i][j];
				}
			}
			for (int i = 0; i < N; i++ ) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++ ) {
					arr2[i][j] = Integer.parseInt(st.nextToken());
					sum[i][j] += arr2[i][j];
				}
			}
			
			for (int i = 0; i < N; i++ ) {
				for (int j = 0; j < M; j++ ) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
	}
}
