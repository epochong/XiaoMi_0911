import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/11 19:43
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        String str = input.next();
        String rem = input.next();
        for (int i = 0; i < rem.length(); i++) {
            str = str.replace(String.valueOf(rem.charAt(i)),"");
        }
        System.out.println(str);
    }
}
