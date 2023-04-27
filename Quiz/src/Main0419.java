import java.util.Scanner;

public class Main0419 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] arr = new char[5][15];

		for ( int i = 0; i < 5; i++ ) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();

			for ( int j = 0; j < ch.length ; j++ ) {
				arr[i][j] = ch[j];
			}
		}

		for (int j = 0; j < 15 ; j++) {
			for (int i = 0; i < 5; i++) {
				if(arr[i][j]=='\0')		// 값이 null일 경우, 넘어가고 계속 진행 ( continue )
					continue;
				System.out.print(arr[i][j]);
			}
		}		
	}
}

/* 공백,null 값 제거 해야 하는 이유
 System.out.print((int)arr[i][j] + ", ");

65, 65, 66, 67, 68, 68, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
97, 102, 122, 122, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,

>> 값을 넣지 않았어도 char 타입이라 데이터가 들어가고있었음


if(arr[i][j]=='\0')		// 값이 null일 경우, 넘어가고 계속 진행 ( continue )
	continue;

if(chs[j][i]==' ' || chs[j][i]=='\0')		// 출력을 할 떄, 참조한 인덱스가 공백 또는 null 문자 일 경우, 넘어가고 계속 진행 ( continue )
					continue;
 */
