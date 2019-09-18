import javax.swing.*;
import java.util.*;
public class exercise1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a >= 20 && a <= 30) {
            if (a % 2 == 0) {
                System.out.println("tom");
            } else {
                System.out.println("jerry");
            }
        } else {
            System.out.println("number doesnot exist between 20 and 30");
        }
    }
}
