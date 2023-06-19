import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i <  N; i++ ) {
			str[i] = br.readLine();
		}
		Arrays.sort(str);
		int[] cnt = new int[str.length];
		int count = 1;
		for (int i = 0; i < str.length; i++ ) {
			if (hs.contains(str[i])) {
				count++;
				hs.add(str[i]);
				cnt[i] = count;
			} else {
				hs.add(str[i]);
				count = 1;
				cnt[i] = count;
			}
		}
		String[][] arr = new String[str.length][2];
 		for ( int i=0; i<str.length; i++) {
 			arr[i][0] = str[i];
 			arr[i][1] = cnt[i].toString();
 					
 		}

		System.out.println(Arrays.toString(str));
		System.out.println(hs);			
		System.out.println(Arrays.toString(cnt));






	}
}
