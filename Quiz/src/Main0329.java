import java.util.Scanner;

public class Main0329 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("x 좌표를 입력하세요 : ");	
		int x = sc.nextInt();
		
		// System.out.println("y 좌표를 입력하세요 : ");
		int y = sc.nextInt();
		
		if (( x > 0 ) && ( y > 0 )) {
			System.out.println("1");
		} else if (( x > 0 ) && ( y < 0 )) {
			System.out.println("4");
		} else if (( x < 0 ) && ( y > 0 )) {
			System.out.println("2");
		} else if (( x < 0 ) && ( y < 0 )) {
			System.out.println("3");
		}
	}
}
