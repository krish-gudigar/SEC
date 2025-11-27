import java.util.*;
class Str2 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the two strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("before case change");
        System.out.println(s1);
        System.out.println(s2);
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println("after case change");
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
        }
        sc.close();
    }


}