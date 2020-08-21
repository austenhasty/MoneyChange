import java.util.Scanner;

public class MoneyChange {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(getChange(m));
    }

    public static int getChange(int m) {
        int ten = 10, five = 5, one = 1, count = 0;
        while (m != 0) {
            if (m - ten >= 0) {
                m = m - ten;
                count++;
            }
            else if (m - five >= 0) {
                m = m - five;
                count++;
            }
            else if (m - one >= 0) {
                m = m - one;
                count++;
            }
        }
        return count;
    }
}
