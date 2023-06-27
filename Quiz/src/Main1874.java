import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int n = str.length();

		for ( int i = 0; i < K; i++ ) {
			for (int j = 0; j < n/K ;  j++ ) {
				sb.append(str.charAt(j%2==0?j*K+i:j*K+K-1-i));
			}
		}
		System.out.println(sb);
	}
}
