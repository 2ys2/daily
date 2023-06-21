import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i <  N; i++ ) {
			hs.add(br.readLine());
		}
		for (int i = 0; i < M; i++ ) {
			String str = br.readLine();
			if (hs.contains(str)){
				list.add(str);
			}
		}
		sb.append(list.size() + "\n");
		Collections.sort(list);
		for (String s : list) {
			sb.append(s+ "\n");
		}
		System.out.println(sb);
	}
}
