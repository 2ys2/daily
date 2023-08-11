import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		
		long gcd = gcd(A, B);
		
		
		/* 최소공배수 = 두 자연수의 곱 / 최대공약수 */
		
		System.out.println( A*B/gcd);
		
	}
	
	public static long gcd(long x, long y) {
		
		if ( y == 0 ) return x;
		
		return gcd(y, x%y);
		
	}
	
	
}
