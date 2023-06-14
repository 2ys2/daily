import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] arr2 = new int[N];
		HashMap<Integer, Integer> hm = new HashMap<>();
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		for ( int i = 0; i < N; i++) {
			if (!hm.containsKey(arr2[i])) {
				hm.put(arr2[i], cnt);
				cnt++;
			}
		}
		for (int i = 0; i < N; i++ ) {
			if(hm.containsKey(arr[i])) {
				sb.append(hm.get(arr[i]) + " ");
			}
		}
		System.out.println(sb);
	}
}
