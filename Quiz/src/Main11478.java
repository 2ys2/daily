import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashSet<String> hs = new HashSet<>();

		String str = br.readLine();
		ArrayList<String> list = new ArrayList<>();

		for(int i = 0; i<str.length(); i++ ) {
			for (int j = i+1; j<=str.length(); j++) {
				list.add(str.substring(i, j));
				hs.add(str.substring(i, j));
			}
		}
		System.out.println(hs.size());
	}
}
