import java.util.*;
class Str2a{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String A=sc.nextLine();
        String B=sc.nextLine();
    System.out.println("before changing");
    System.out.println(A);
    System.out.println(B);
    System.out.println("after changing");
    System.out.println(A.toUpperCase());
    System.out.println(B.toUpperCase());
    System.out.println(A.toLowerCase());
    System.out.println(B.toLowerCase());
    if(A.equals(B)){
        System.out.println("both are  equal");
    }
    else


}