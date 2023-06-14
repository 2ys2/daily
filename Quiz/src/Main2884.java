import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if ( H == 0 ) {
			H = 24;
			if (  ((H*60 + M) - 45 )/60 == 24) {
				int HH = ((H*60 + M) - 45 )/60;
				HH = 0;
				System.out.println( HH + " " + ((H*60 + M) - 45 )%60);
			} else {
			System.out.println( ((H*60 + M) - 45 )/60 + " " + ((H*60 + M) - 45 )%60);
			}
		}else {
			System.out.println( ((H*60 + M) - 45 )/60 + " " + ((H*60 + M) - 45 )%60);
		}
	}
}
/*
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
입력 시간은 24시간 표현을 사용한다.
24시간 표현에서 하루의 시작은 0:0(자정)이고,
끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때,
불필요한 0은 사용하지 않는다.
10 10
9 25
 */