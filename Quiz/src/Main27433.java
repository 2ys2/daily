import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27433 {
	
	static long factorial(long x) {
		if (x <=0 ) {
			return 1;
		} else {
			return x * factorial(x-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long result = factorial(N);
		System.out.println(result);
	}
}

//		long p = 1;
//		if ( N == 0 ) {
//			System.out.println(1);
//		} else {
//			for (long i = 1; i <= N; i++ ) {
//				p *= i;
//			}
//			System.out.println(p);