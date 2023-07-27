import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int day = (C - B) / (A - B);
		if ((C - B) % (A - B) != 0)
			day++;

		System.out.println(day);

	}
}
/*
 * Stack<Integer> s = new Stack<>(); for (int i = 0; i < C; i++) { s.push(1); }
 * 
 * int cnt = 0; while (true) { cnt++; for (int i = 0; i < A; i++) { s.pop(); if
 * (s.size() == 0) { System.out.println(cnt); return; }; }
 * 
 * for (int i = 0; i < B; i++) { s.push(1); }
 * 
 * }
 */
