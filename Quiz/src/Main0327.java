import java.util.Scanner;

public class Main0327 {
	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner sc = new Scanner(System. in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		sc.close();
		
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
}
