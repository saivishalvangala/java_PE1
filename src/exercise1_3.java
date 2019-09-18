import java.util.*;
public class exercise1_3 {
    public static void main(String [] args)
    {
        Scanner scan =new Scanner(System.in);
        String s= scan.nextLine();
        String s1="aeiouAEIOU";
        String c;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)){
                c=String.valueOf(s.charAt(i));
                                if(s1.contains(c))
                                {
                                    System.out.print(s.charAt(i)+"-vowel");
                                }
                                else
                                {
                                    System.out.print(s.charAt(i)+"-consonant");
                                }
        }
            else{
                System.out.println("Character at "+i+" is not a alphabet");
            }
        }
    }
}
