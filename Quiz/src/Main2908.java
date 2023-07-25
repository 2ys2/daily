import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[] arr = new int[3];
		arr[0] = A/100;
		arr[1] = (A%100)/10;
		arr[2] = (A%100)%10;

		int[] brr = new int[3];
		brr[0] = B/100;
		brr[1] = (B%100)/10;
		brr[2] = (B%100)%10;

		int[] result = null;
		
		if (arr[2] != brr[2]) {
			result = arr[2] > brr[2] ? arr : brr;
		}else if (arr[1] != brr[1]) {
			result = arr[1] > brr[1] ? arr : brr;
		}else if (arr[0] != brr[0]) {
			result = arr[1] > brr[1] ? arr : brr;
		}
		
		for(int i = result.length-1; i >= 0; i-- ) {
			sb.append(result[i]);
		}
		
		System.out.println(sb);
	}
}
