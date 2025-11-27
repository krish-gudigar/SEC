import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("First line: " + br.readLine());
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: File not found.");
        }
        catch(IOException e){
            System.out.println("Error: Issue reading file.");
        }
    }
}
