import java.util.Scanner;

public class Main0331 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 1; i <= n ; i++ ) {
            for ( int j = 0; j < n-i ; j++ ){
                System.out.print(" ");
            } // j end
            for ( int k = 0; k < (2*i)- 1 ; k++) {
                System.out.print("*");
            } // k end
            System.out.println();
        } // i end

        for ( int i = n-1; i > 0 ; i-- ) {
            for ( int j = 0; j < n-i ; j++ ){
                System.out.print(" ");
            } // j end
            for ( int k = 0; k < (2*i) -1 ; k++) {
                System.out.print("*");
            } // k end
            System.out.println();
        } // i end



    }// main end

}
