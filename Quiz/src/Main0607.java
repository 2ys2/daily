import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main0607 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		int[] arr = new int[1000000];
//		arr[0] = 1;
// 
//		if ( N == 1) {
//			System.out.println(1);
//		} else {
//			for (int i = 1; i < 1000000 ; i++ ) {
//				arr[i] += arr[i-1] + 6*i;
//
//				if ( arr[i-1] <= N && N <= arr[i]) {
//					System.out.println( (arr[i] - arr[i-1] )/6 + 1 );
//					break;
//				}
//			}
//		}
		int cnt = 0;
		int sum = 0;
		while (true) {
			if ( N-1 <= sum ) {
				System.out.println(cnt+1);
				break;
			}
			cnt ++;
			sum += cnt*6;
		}
	}
}

/*
1 : 1
6 : 2 7		2
12 : 8 19	3
18 : 20 37	4
24 : 38 61	5
30 : 62 91	6
...

move 1
num move * 6
1 -> 6
2 -> 18
3 -> 36
4 -> 62

n = 1 ~ 
a0 = 1
a1 = 1 + 6*1
a2 = 1 + 6*1 + 6*2
a3 = 1 + 6*1 + 6*2 + 6*3
a4 = 1 + 6*1 + 6*2 + 6*3 + 6*4
a5 = 1 + 6*1 + 6*2 + 6*3 + 6*4 + 6*5
...

a(n) = 1 + ...+  6*(n-1) + 6*(n);
*/