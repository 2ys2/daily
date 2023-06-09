import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, String> hm1 = new HashMap<>();
		HashMap<String, String> hm2 = new HashMap<>();
		for (int i = 1; i < N+1; i++ ) {
			String str = br.readLine();
			hm1.put(str, Integer.toString(i));
			hm2.put(Integer.toString(i), str);
		}
		
		for (int i = 0; i < M; i++ ) {
			String str = br.readLine();
			if ( hm1.containsKey(str)) {
				System.out.println(hm1.get(str));
			} else {
				System.out.println(hm2.get(str));
			}
		}
	}
}
