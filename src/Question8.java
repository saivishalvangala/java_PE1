import java.util.*;
public class exercise1_8 {
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        int a=binarySearch(x);
        if(a==x)
        {
            System.out.println("Number guessed matches the original number");
        }
        else
            System.out.println("number not found" );

    }
    public static int binarySearch( int x)
    {
        int l = 1, r=100;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (m == x)
                return m;

            // If x greater, ignore left half
            if (m < x) {
                l = m + 1;
                System.out.println("Number guessed is less than original number");
            }


                // If x is smaller, ignore right half
            else {
                r = m - 1;
                System.out.println("Number guessed is more than original number");
            }
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}

