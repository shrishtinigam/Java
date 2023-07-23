import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile2_20BRS1193 {
	public static void main(String args[]) {
		FileReader fr = null;
		try{
			File file = new File("ReadConten.txt");
			fr = new FileReader(file); 
			char [] a = new char[1000];
			fr.read(a);
			for(char c : a) 
                System.out.print(c);
		}
		catch (IOException e) { e.printStackTrace(); }
		finally {
			try {  
                fr.close(); 
            }
			catch (IOException ex) { 
                ex.printStackTrace(); 
            }
        }
    }
}
