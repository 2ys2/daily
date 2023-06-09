import java.util.Arrays;
import java.util.Scanner;

public class Main0405 { // 재귀함수 사용
	public static int su(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return su(n - 1) + su(n - 2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(su(n));
    }
}

/*
 public class Main { //  for문 사용
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


	int[] a = new int[101];	
         a[0] = 0;
		 a[1] = 1;
				for ( int i = 2  ; i <= n; i++ ) {

					a[i] = a[i-1] + a[i-2];
					}
				System.out.println(a[n]);
    }
}
 */
