import java.util.Scanner;

public class Main0328 {
	public static void main(String[] args) {
		
		
		
	Scanner sc = new Scanner(System. in);
	
	int A;
	int B;
	
	A = sc.nextInt();
	B = sc.nextInt();
	
	/*
	 * int A_100 = A / 100; //100자리 int A_10 = (A % 100) / 10; //10자리 int A_1 = (A %
	 * 100) % 10; //1자리
	 */	
	
	int B_100 = B / 100; //100자리
	int B_10 = (B % 100) / 10; //10자리
	int B_1 = (B % 100) % 10; //1자리
	
	//System.out.println(A_100 + " " +  A_10 + " " + A_1);
	//System.out.println(B_100 + " " +  B_10 + " " + B_1);
	
	System.out.println(A * B_1);
	System.out.println(A * B_10);
	System.out.println(A * B_100);
	System.out.println(A * B);

	}	
}
