import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		if ( n ==0 && n == 1 ) {
			System.out.println(1);
			return;
		}

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			int result = min(a);

			if (result >= 0) {
				System.out.println(result);
			}

		}
	}

	public static int min(int x) {

		for (int i = 2; i <= x; i++) {
			if (x != i) {
				if ( x%i == 0) {
					return min(x+1);
				}
			}
		}
		return x;

	}
}
