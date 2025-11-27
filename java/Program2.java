import java.util.*;
class Program2{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int a=sc.nextInt();
         
        if (a>0){
            System.out.println("the number is +ve");
        }
        else{
            System.out.println("the number is -ve");
        }
        sc.close();
    }

}
