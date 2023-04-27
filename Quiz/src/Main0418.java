import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main0418 { // TreeMap
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, String > map = new TreeMap<>();
		
		int[][] arr = new int[9][9];
		
		for ( int i = 0; i < 9; i++ ) {
			for ( int j = 0; j < 9; j++ ) {
				arr[i][j] = sc.nextInt();
				map.put(arr[i][j], ( (i+1) + " " + (j+1)) );
			}
		}
	
		System.out.println(map.lastKey());
		System.out.println(map.get(map.lastKey()));	
	}
}

/* HashMap 이용
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String > map = new HashMap<>();
		
		int[][] arr = new int[9][9];
		
		for ( int i = 0; i < 9; i++ ) {
			for ( int j = 0; j < 9; j++ ) {
				arr[i][j] = sc.nextInt();
				map.put(arr[i][j], ( (i+1) + " " + (j+1)) );
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet()); // keySet의 데이터를 가진 list 생성됨.
		int n = list.size()-1; // 사이즈는 크기라서 마지막 인덱스는 -1
		System.out.println(list.get(n)); 
		System.out.println(map.get(list.get(n)));
	
	}
}
 */
