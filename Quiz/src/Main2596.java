import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2596 {
	static String[] num = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
	static String[] alp = {"A", "B", "C", "D", "E", "F", "G", "H"};


	static String check(String str) { //같거나, 하나만 다르면 알파벳반환, 2개 이상 다르면 null 반환

		for (int j = 0; j < num.length; j++ ) {
			if (str.equals(num[j])) {
				return alp[j]; //같으면 알파벳 반환
			}

			int cnt = 0;
			for(int k = 0; k < str.length(); k++ ) { //다를때
				if (str.charAt(k) != num[j].charAt(k) ) {
					cnt++;
				}
			}
			if( cnt == 1) { //1개만 다르면 알파벳 반환
				return alp[j];
			}
		}
		return null; //2개 이상 다르면 null 반환
	} //end check();
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();


		for (int i = 0; i < N; i++) {
			String a = str.substring(6*i,  6*(i+1));
			String ans = check(a); //함수가 복잡할땐 분리하자!!!!!!!!
			if ( ans == null ) { //null이면 모르는 문자이기 때문에 문자의 위치 출력
				System.out.println(i+1);
				return; //main 함수 끝!
			}
			sb.append(ans); //반환값이 null이 아니면 알파벳이 반환된것으로 sb.append!
		}
		System.out.println(sb);
	}
}
