import java.util.*;
public class exercise1_5 {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        String [] a=s.split(" ");
        int sum=0;
        int flag=0;
        for(int i=0;i<a.length;i++){
            flag= check(a[i]);
            if(flag==1)
            {
                sum+=Integer.parseInt(a[i]);

            }
            else{
                System.out.println("there is a non integer value in our string");
                break;
            }
        }
        if(flag==1)
        System.out.println(sum);
    }
    public static int check(String s)
    {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57){

            }
            else{
                return 0;
            }
        }
        return 1;
    }
}
