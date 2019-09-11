import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/11 19:48
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Problem {
    public static int calDig(int n) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum == n) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int res = calDig(n);
            if (n == 0) {
                System.out.println("No");
            } else {
                System.out.println(res);
            }
        }
    }
}
