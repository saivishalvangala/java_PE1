import java.util.*;
public class exercise1_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int l = a.length();
      /*  a= sort(a);
        String s= a.substring(l);
        String s1=a.substring(l,a.length());
        System.out.println(s);
        int sum=Integer.parseInt(s1);*/
        int[] arr = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            if (arr[i] % 2 == 0)
                sum += arr[i];

        }
        Arrays.sort(arr);
        for (int i = l-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("sum of even numbers is" + sum);
        if (sum < 15)
            System.out.println("flase");
        else
            System.out.println("true");

    }
}