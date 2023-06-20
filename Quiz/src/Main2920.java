import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int str[] = new int[8];
		for (int i = 0; i <  8; i++ ) {
			str[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		for (int i = 0; i <  7; i++ ) {
			if ((str[i+1] == str[i] - 1) ) {
				cnt--;
			} else if ( (str[i+1] == str[i] + 1) ) {
				cnt++;
			} else {
				cnt=0;
				break;
			}
		}

		if ( cnt == 8) {
			sb.append("ascending");
		} else if (cnt == -8) {
			sb.append("descending");
		} else {
			sb.append("mixed");
		}
		System.out.println(sb);





		/*
		 * int[] asc = {1,2,3,4,5,6,7,8}; int[] des = {8,7,6,5,4,3,2,1}; int cnt = 0;
		 * for (int i = 0; i < 8; i++ ) { int n = Integer.parseInt(st.nextToken()); if (
		 * n == asc[i] ) { cnt++; } else if ( n == des[i] ) { cnt--; } else { cnt = 0; }
		 * } if ( cnt == 8) { sb.append("ascending"); } else if (cnt == -8) {
		 * sb.append("descending"); } else { sb.append("mixed"); }
		 * System.out.println(sb);
		 */
	}
}
