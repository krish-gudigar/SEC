import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int rev=0;
        while(n!=0)
        {
        
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;   
        }
        System.out.println("Reverse of a number is: "+rev);
        sc.close();
    }
    
}
