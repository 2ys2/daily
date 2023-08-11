import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2485 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		int[] cnt = new int[N - 1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if (i > 0) {
				cnt[i-1] = arr[i] - arr[i-1];
			}
		}

		for (int i = 0; i <= cnt.length - 2; i++) {
			cnt[i + 1] = gcd(cnt[i], cnt[i + 1]);
		}

		int gap = cnt[cnt.length - 1];

		System.out.println((arr[N - 1] - arr[0]) / gap - (N - 1));

	} // main end

	
	public static int gcd(int x, int y) {
		if (y == 0)
			return x;

		return gcd(y, x % y);
	}
}
