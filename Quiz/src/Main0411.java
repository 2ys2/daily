import java.util.ArrayList;
import java.util.Scanner;

public class Main0411 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();


            for (int i = 1; i <= b; i++) {
                for (int j = 0; j < i; j++) {
                    arr.add(i);
                }
            }


        int sum = 0;
        for ( int i = a-1; i < b; i++ ) {
            int num = (int) arr.get(i);
            sum += num;
        }

        System.out.println(sum);
    }
}
