import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if ( a == b && b==c ) {
			sb.append(10000+(a*1000));
		} else if ( a!=b && b!=c && c!=a) {
			int max = Math.max(Math.max(a, b), c);
			sb.append(max*100);
		} else {
			if ( (a==b) || (a==c) ){
			sb.append(1000+(a*100));
			} else if ( b==c ) {
				sb.append(1000+(b*100));
			} 
		}
		System.out.println(sb);
	}
}
