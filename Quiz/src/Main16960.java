import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main16960 {
	static int[][] arr;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		int[] cnt = new int[M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i][num-1] = num;
				cnt[num-1]++;
			}
		}

		System.out.println(Arrays.toString(cnt));


		System.out.println(Arrays.toString(cnt));
		for(int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}


	}
}





