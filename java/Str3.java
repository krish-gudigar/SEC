import java.util.*;
class Str3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String A=sc.nextLine();
        System.out.println(A.length());
        System.out.println(A.charAt(0));
        System.out.println(A.charAt(A.length()-1));
        String reversed="";
        for(int i=A.length()-1;i>=0;i--){
            reversed+=A.charAt(i);
        }
        if (A.equals(reversed)){
            System.out.println("the given string is a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
        System.out.println("reversed string:"+reversed);
        String normal="";
        for(int i=0;i<=A.length()-1;i++){
            normal+=A.charAt(i);
        }
        System.out.println(normal);
        sc.close();
    }
}

