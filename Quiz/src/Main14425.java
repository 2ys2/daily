import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.concurrent.ArrayBlockingQueue;

public class Main14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < N; i++){
			hs.add(br.readLine());
		}
		
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i <  M; i++) {
			String str = br.readLine();
			if ( hs.contains(str)) {
				arr.add(str);
			}
		}
		System.out.println(arr.size());
	}
}
