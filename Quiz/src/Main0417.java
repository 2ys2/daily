import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main0417 {
public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			que.add(i+1);
		}
		
		
		while ( true ) {
			
			if ( que.size() == 1 ) {
				System.out.println(que.peek());
				break;
			}
			
			int tmp = 0;			
			que.poll();
			tmp = que.peek();
			que.add(tmp);
			que.poll();		
		}
	}
}

/*
 que.poll();
 que.add(que.poll());
 */
