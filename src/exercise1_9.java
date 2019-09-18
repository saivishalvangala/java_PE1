import java.util.*;
public class exercise1_9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char[] c=s.toCharArray();
        char temp;
        int i=0,j=s.length()-1;
        while(i<j)
        {
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }

        String s1= String.valueOf(c);
        System.out.println(s1);

    }
}
