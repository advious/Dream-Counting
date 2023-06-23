import java.util.*;

public class Program {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] numCount = new int[10];
        for (int i = n; i <= m; i++) {
            char[] digits = ("" + i).toCharArray();
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == '0') {
                    numCount[0]++;
                } else if (digits[j] == '1') {
                    numCount[1]++;
                } else if (digits[j] == '2') {
                    numCount[2]++;
                } else if (digits[j] == '3') {
                    numCount[3]++;
                } else if (digits[j] == '4') {
                    numCount[4]++;
                } else if (digits[j] == '5') {
                    numCount[5]++;
                } else if (digits[j] == '6') {
                    numCount[6]++;
                } else if (digits[j] == '7') {
                    numCount[7]++;
                } else if (digits[j] == '8') {
                    numCount[8]++;
                } else if (digits[j] == '9') {
                    numCount[9]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numCount[i] + " ");
        }
    }
}
