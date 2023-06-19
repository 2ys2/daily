import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String[] str = br.readLine().split("");

		Stack<String> s = new Stack<>();
		int n = str.length/2;

		if (str.length % 2 == 0 ) {
			for (int i = 0; i < n; i++ ) {
				s.push(str[i]);
			}
			for (int i = n; i < str.length; i++ ) {
				if( s.peek().equals(str[i]) ) {
					s.pop();
				} else {
					System.out.println(0);
					break;
				}
			}

		} else {
			for (int i = 0; i < n; i++ ) {
				s.push(str[i]);
			}
			for (int i = n+1; i < str.length; i++ ) {
				if( s.peek().equals(str[i]) ) {
					s.pop();
				} else {
					System.out.println(0);
					break;
				}
			}                     

		}
		
		if(s.isEmpty()) {
			System.out.println(1);
		}

	}
}
