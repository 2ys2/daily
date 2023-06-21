import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11034 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str = null;

		while( true ) {
			str = br.readLine();
			if (str == null) break;
			else {
				st = new StringTokenizer(str);
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				int max = 0;
				max = (B-A) > (C-B) ? (B-A) : (C-B);
				System.out.println(max-1);
			}
		}
	}
}
