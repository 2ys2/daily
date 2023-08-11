import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long N = Long.parseLong(br.readLine());
			long cnt = 0;
			
			if ( N == 4 || N == 7) {
				cnt = -1;
			}else if ( N % 5 == 0){
				cnt = (N / 5);
				
			}else if ( N % 5 == 1){
				cnt = (N / 5) + 1;
			}else if ( N % 5 == 2){
				cnt = (N / 5) + 2;
			}else if ( N % 5 == 3){
				cnt = (N / 5) + 1;
			}else if ( N % 5 == 4){
				cnt = (N / 5) + 2;
			}
			System.out.println(cnt);
		}
	}

