import java.util.*;
class Program1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= a+b;
        int d= a-b;
        int e= a*b;
        int f= a/b;
        System.out.println("the two numbers are "+a+" and "+b);
        System.out.println("addition of two numbers is "+c);
        System.out.println("subtraction of two numbers is "+d);
        System.out.println("multiplication  of two numbers is "+e);
        System.out.println("division of two numbers is "+f);

        sc.close();
    }
}

