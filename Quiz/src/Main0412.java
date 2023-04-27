import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main0412 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		int n = Integer.parseInt(N);

		Stack<Integer> st = new Stack<>();

		for ( int i = 0; i < n; i++ ) {
			st.clear();
			char[] ch = br.readLine().toCharArray();

			boolean flag = true;
			for ( int j = 0; j < ch.length; j++ ) {
				if ( ch[j] == '(' ) {
					st.push(1);
				} else {
					if ( st.size() == 0) {
						flag = false;
					}else {
						st.pop();
					}
				}
			}

			if ( flag ) {
				if ( st.isEmpty() ) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}	
}

/*
 접근 방법 ‘ ( ‘ 입력했을때 push하고 ‘ ) ’ 입력했을때 pop 시키면 ‘ ( ) ‘ 한쌍으로 삭제될 수 있다.
stack에 남아있지 않을때 pop을 하면 오류가 발생하기 때문에 이를 잡아 주기 위해 boolean 을 사용한다.
 */