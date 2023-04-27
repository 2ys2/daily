import java.util.Arrays;
import java.util.Scanner;
public class Main0407 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        char[] arr  = sc.next().toCharArray();

	        Arrays.sort(arr);

	        for ( int i = arr.length-1; i >= 0 ; i-- ) {
	            System.out.print(arr[i]);
	        }

//	        Arrays.sort(arr, Collections.reverseOrder());
//	        char형은 String과 달리 문자열을 바로 받을 스캐너로 받을 수 없다.
//	        따라서 sc.next() 뒤에 charAt(0) 또는 문자열이 많은 경우
//	        char 배열을 생성해 toCharArray()로 받아줘야 한다.
	    }

}
