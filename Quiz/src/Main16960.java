import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main16960 {
	static int N, M;
	static int[] numset;
	static ArrayList<Integer>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		list = new ArrayList[N+1];
		numset = new int[Math.max(N, M)+1];
		for (int i = 1; i <= N; i++ ) {
			list[i] = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			for (int j = 0; j < num; j++ ) {
				int temp = Integer.parseInt(st.nextToken());
				list[i].add(temp);
				numset[temp]++;
			}
		}
		
		System.out.println(Arrays.toString(numset));

		for (int i = 1; i <= N; i++ ) {
			if ( onlamp(i) == 1 ) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);


	}

	private static int onlamp(int index) {
		int result = 1;
		for (int num : list[index]) {
			numset[num]--;
			if (numset[num] <= 0 ) {
				result = 0;
			}
		}
		
		for (int num : list[index]) {
			numset[num]++;
		}
		
		return result;
	}
}

