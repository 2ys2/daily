import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main0425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		TreeMap<String, String> tm = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			String name = st.nextToken();
			String status = st.nextToken();
			tm.put(name, status);
		}
		
		
		ArrayList<String> arr = new ArrayList<>();
		for( String name : tm.keySet() ) {
			if (tm.get(name) == "enter") {

				arr.add(name);
			}
		}
	}
}

/* set 이용해서 풀기
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class homework_0425 {
	 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
    int n = Integer.parseInt(br.readLine());

    Set<String> s = new HashSet<>();

    for ( int i = 0; i < n; i++ ){

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        String name = st.nextToken();
        String status = st.nextToken();


        if (  status.equals("leave") ) {
            s.remove(name);
        } else if ( status.equals("enter")) {
            if ( !s.contains(name) ) {
                s.add(name);
            }
        }
    }
    
    Iterator<String> it = s.iterator();
    	while(it.hasNext()) System.out.println(it.next());

}
}
 */
