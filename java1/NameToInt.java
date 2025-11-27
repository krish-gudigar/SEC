import java.util.*;

public class NameToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String sub = name.substring(0,3); 
            int num = Integer.parseInt(sub);

            System.out.println("Converted number = " + num);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Error: Name must contain at least 3 characters!");
        }
        catch(NumberFormatException e){
            System.out.println("Error: First 3 characters must be numeric to convert!");
        }
    }
}
