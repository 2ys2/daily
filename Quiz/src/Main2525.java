import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		int hh = ((A*60 + B) + C )/60;
		int mm = ((A*60 + B) + C )%60;
		
		if ( hh > 23 ) {
			hh = hh - 24;
			System.out.println(hh + " " + mm);
		} else {
		System.out.println(hh + " " + mm);
		}
	}
}
