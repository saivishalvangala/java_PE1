import java.util.*;
public class exercise1_6 {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        char c=(scan.next()).charAt(0);
        if(c>=48&&c<=57)
        {
            System.out.println("digit");
        }
        else if(c>=65&&c<=90)
        {
            System.out.println("capital letter");
        }
        else if(c>=97&&c<=122)
        {
            System.out.println("small letter");

        }
        else{
            System.out.println("special symbol");
        }

    }
}
