import java.util.Scanner;

public class exercise1_1 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        /*palindrome check*/
        int i=0, j=s.length(),flag=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j-1)){
                flag=1;
                break;
            }
            i++;
            j--;
        }
        int sum= getsum(s);

        if(flag==0)
        {
            if(sum>25)
            System.out.println(s+"is a palindrome and sum of even numbers is greater than 25");
            else
                System.out.println(s+"is a palindrome and sum of even numbers is greater than 25");

        }
        else
            System.out.println(s+"is not apalindrome");

    }
    public static int getsum(String s)
    { int sum=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)%2==0)
                sum+=(int)s.charAt(i);
        }
        return sum;
    }
}
