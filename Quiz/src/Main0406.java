import java.util.Scanner;
public class Main0406 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1 ≤ k, n ≤ 14
        int[][] arr = new int[15][15];

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j <= 14; j++) { // 0층 n호
                arr[0][j] = j;
                arr[j][1] = 1;
            }


            for (int x = 1; x <= 14; x++) { // k층
                for (int y = 2; y <= 14; y++) { // n호
                    arr[x][y] = arr[x - 1][y] + arr[x][y - 1];
                }
            }
            System.out.println(arr[k][n]);
        }

    }

}
