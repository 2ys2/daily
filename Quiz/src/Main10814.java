import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) { //나이순으로 정렬하면 compre 메소드에서 나이가 같을경우(반환값이 0 인경우)는 두 객체의 위치를 바꾸지 않기 때문에 자연스럽게 입력순서로 정렬이 된다.
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});

		for (int i = 0; i < N; i++ ) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}	
}
