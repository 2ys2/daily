import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); //트럭을 한 대 주차할 때는 1분에 한 대당 A원
		int B = Integer.parseInt(st.nextToken()); //두 대를 주차할 때는 1분에 한 대당 B원
		int C = Integer.parseInt(st.nextToken()); //세 대를 주차할 때는 1분에 한 대당 C원

		int[] time = new int[101]; //<- ArrayIndexOutOfBounds
		for (int  i = 0; i < 3; i++ ) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			for (int j = start+1; j <= end; j++ ) {
				if(time[j] == 0 ) {
					time[j]++;
					
				} else {
					time[j]++;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < time.length; i++) {
			if( time[i] == 1 ) {
				sum += A*1;
			} else if ( time[i] == 2) {
				sum += B*2;
			} else if ( time[i] == 3 ) {
				sum += C*3;
			}
		}
		System.out.println(sum);
	}
}
