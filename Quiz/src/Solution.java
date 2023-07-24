import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
public class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); //테스트케이스 개수

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); //선수 수
			sc.nextLine();
			String str = sc.nextLine();
			String[] sarr = str.split(" ");
			int[] arr = new int[sarr.length];
			for (int i = 0; i < sarr.length; i++ ) {
				int a = Integer.parseInt(sarr[i]);
				arr[i] = a;
			}
			//System.out.println(Arrays.toString(arr));

			if ( arr.length == 1) {
				AnswerN = arr[0];
			} else {
			
			int minX = 1;
			int sumX = 0;
			for (int i = 0; i < arr.length; i++ ) {
				minX = Math.min(arr[i], minX);
				System.out.println(minX);
				sumX += Math.max(arr[i], sumX) + arr[i];
				System.out.println(sumX);
				
				
			}
			}

			//System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}

/*
5
-1 2 -3 2 -1 -> 15
1
0 -> 0
4
1 1 1 1 -> 16
 */

/*
int maxValint = Integer.MIN_VALUE, sumVal = 0;
	for (int i = 0; i < arr.length; i++ ) {
		sumVal += + arr[i];

		if (maxValint < sumVal)  maxValint = sumVal;
		f (sumVal < 0)  maxValint = Math.abs(sumVal);

		}
System.out.println("#"+test_case+" "+ maxValint);
 */