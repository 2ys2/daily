import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for (int i=0; i < N; i++) {
			A[i]= Integer.parseInt(st.nextToken());

		}

		st = new StringTokenizer(br.readLine());
		int[] B = new int[N];
		for (int i=0; i < N; i++) {
			B[i] = Integer.parseInt(st.nextToken());

		}

	}
}
