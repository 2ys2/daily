import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		int N = 0;
		int M = 0;
		for (int i = 0; i < 9; i++ ) {
			int h = sum - arr[i];
			for (int j = i+1; j < 9; j++ ) {
				int hh = h - arr[j];
				if ( hh == 100 ) {
					N = arr[i];
					M = arr[j];
				}
			}
		}

		for (int i = 0; i < 9; i++ ) {
			if ( arr[i] == N || arr[i] == M ) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
