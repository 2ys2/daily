import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int i = 0;
		
		while( cnt != N ) {
			i++;
			String num = Integer.toString(i);
			
			if ( num.contains("666") ) {
				cnt++;
			}
			
			if ( cnt == N) {
				System.out.println(i);
				break;
			}
			
			
		}
	}
}
