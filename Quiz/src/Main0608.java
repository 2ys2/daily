import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main0608 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> hm = new HashMap<>();
		int cnt = 0;
		String temp1 = null;
		String temp2 = null;

		//사람들 만난 기록 수
		int N = Integer.parseInt(br.readLine());
		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			String name1 = st.nextToken();
			String name2 = st.nextToken();
			
			if (name1.equals("ChongChong") || name2.equals("ChongChong")) {
				cnt = 1;
				temp1 = null;
				temp2 = null;
			}
			
			if (temp1 != null && temp1.equals(name1)) {
				cnt = 1;
			} else if (temp2 != null && !temp2.equals(name1)) {
				cnt = 0;
			}
			
			hm.put(name1, cnt);
			hm.put(name2, cnt);
			
			temp1 = name1;
			temp2 = name2;
		}
		int sum = 0;
		for ( String key : hm.keySet()) {
			sum += hm.get(key);
		}
		System.out.println(sum);
	}
}
