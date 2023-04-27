import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main0413 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		int n = Integer.parseInt(N);

		Stack<Integer> st = new Stack<>();

		for ( int i = 0; i < n ; i++ ) {
			String K = br.readLine();
			int k = Integer.parseInt(K);

			if ( k == 0) {
				st.pop();
			} else {
				st.push(k);
			}
		} // for end

		int sum = 0;
		if (st.size() != 0) {
			int j = st.size();
			for ( int i = 0; i < j ; i++ ) {
				sum += st.pop();
			}
			System.out.println(sum);

		} else {
			System.out.println(0);
		}
	}
}
/*
 stack에서 pop은 정수가 바로 출력되기 때문에 출력과 동시에 연산이 가능하다. sum += st.pop();
스텍의 사이즈는 실시간으로 줄어들기 때문에 for문 전에 사이즈를 고정시켜준다. int j = st.size();
 */
