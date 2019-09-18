import java.util.*;
public class exercise1_4 {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=i;j>0;j--)
            {
                System.out.print(i+" ");
            }
        }
    }
}
