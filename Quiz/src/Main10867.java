import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		TreeSet<Integer> ts = new TreeSet<>();
		for ( int i = 0; i < N; i++ ) {
			ts.add(Integer.parseInt(st.nextToken())); 
		}
		
		for (Integer i : ts) {
			sb.append(i + " ");
		}
		System.out.println(sb);
	}
}
