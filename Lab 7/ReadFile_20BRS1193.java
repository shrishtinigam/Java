import java.io.File;  
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.Scanner;

public class ReadFile_20BRS1193 {
    public static void main(String[] args) {
        try {
          File file = new File("ReadContent.txt");
          Scanner reader = new Scanner(file);
          while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
          }
          reader.close();
        } catch (FileNotFoundException e) {
          System.out.println("File was not found.");
          e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Exception has occured.");
            e.printStackTrace();
        }
      }
}
