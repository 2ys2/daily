import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main26069 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashSet<String> hs = new HashSet<>();

		//사람들 만난 기록 수
		int N = Integer.parseInt(br.readLine());
		hs.add("ChongChong");
		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			String name1 = st.nextToken();
			String name2 = st.nextToken();
			
			if ( hs.contains(name1) || hs.contains(name2) ) {
				hs.add(name1);
				hs.add(name2);
			}
		}
		System.out.println(hs.size());
	}
}
