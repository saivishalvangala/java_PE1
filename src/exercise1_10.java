import java.util.*;
public class exercise1_10 {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int n=scan.nextInt();
        int l=s.length();
        String s1=s.substring(l-n,l);
        while(n>0)
        {
            s=s+s1;
            n--;
        }
        System.out.println(s);
    }
}
