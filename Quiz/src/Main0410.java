import java.util.Scanner;
import java.util.Arrays;
public class Main0410 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int[] set = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i)-'0';
            set[num] += 1;
        }

        if ((set[6] + set[9])%2 == 0) {
            int sum = (set[6] + set[9])/2;
            set[6] = sum;
            set[9] = sum;
        } else {
            int sum = (set[6] + set[9]) / 2 + 1;
            set[6] = sum;
            set[9] = sum;
        }
        Arrays.sort(set);
        System.out.println(set[9]);
    }

}

/*
 charAt으로 반환받은 '1'은 int형이 아닌 char형, 즉 int로 변환시키면 아스키코드값인 49로 변환되기 때문.

'0'(char) -> 48'1'(char) -> 49'2'(char) -> 50'3'(char) -> 51'4'(char) -> 52

따라서 (int) num.charAt(0) + (int) num.charAt(1) 의 값은 99으로 출력된다.

이 때 -'0'(48)을 해주면

48 - 48('0') = 049 - 48('0') = 150 - 48('0') = 251 - 48('0') = 352 - 48('0') = 4

CharAt(int i) - '0'을 통해 char형의 문자들을 int형으로 변환시킬 수 있다.
 */
