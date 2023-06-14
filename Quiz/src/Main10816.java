import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashMap <Integer, Integer> hm = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<N; i++ ) {
			int num = Integer.parseInt(st.nextToken());
			if (hm.containsKey(num)) {
				int cnt = hm.get(num);
				cnt++;
				hm.put(num, cnt);
			} else {
				hm.put(num, 1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<M; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (hm.containsKey(arr[i])) {
				sb.append(hm.get(arr[i]) + " ");
			} else {
				sb.append(0 + " ");
			}
		}
		System.out.println(sb);
	}
}
