import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        int max =0;
        for (int i = 0; i <  N; i++ ) {
            String str = br.readLine();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
            max = Math.max(max, hm.get(str));
        }
        ArrayList<String> arr = new ArrayList<>(hm.keySet());
        Collections.sort(arr);
        for (String s : arr) {
            if (hm.get(s) == max) {
                System.out.println(s);
                break;
            }
        }
    }
}