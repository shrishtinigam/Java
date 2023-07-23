import java.io.*;

public class P1_20BRS1193 {
    public static void main(String args[]) {
        byte[] fileArray = new byte[4000];

        try {
            FileInputStream fr = new FileInputStream("Input.txt");
            fr.read(fileArray);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        int count = 0;
        int wordCount = 0;
        int sentenceCount = 0;
        String data = new String(fileArray);
        for (int i = 0; i < data.length(); i++) {
            char x = data.charAt(i);
            if (x == ' ' || x == '\n') {
                wordCount++;
            }
            if (x == '.' || x == '!' || x == '?') {
                sentenceCount++;
            }
        }
        count = data.length();

        System.out.println("Data read from the file: ");
        System.out.println(data);

        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
    }
}

/*
 * import java.io.*;
 * 
 * public class P2_20BRS1193 {
 * public static void main(String args[]) {
 * char[] fileArray = new char[500];
 * int count = 0;
 * int wordCount = 0;
 * int sentenceCount = 0;
 * try {
 * FileInputStream fr = new FileInputStream("Input.txt");
 * int i = 0;
 * 
 * while ((i = fr.read()) != -1) {
 * char x = (char) i;
 * System.out.print(x);
 * fileArray[count] = x;
 * if (x == ' ' || x == '\n') {
 * wordCount++;
 * }
 * if (x == '.' || x == '!' || x == '?') {
 * sentenceCount++;
 * }
 * }
 * fr.close();
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * System.out.println("Word count: " + wordCount);
 * System.out.println("Sentence count: " + sentenceCount);
 * 
 * try {
 * FileOutputStream fo = new FileOutputStream("Output.txt");
 * 
 * fo.write((int) count);
 * fo.write((int) wordCount);
 * fo.write((int) sentenceCount);
 * 
 * fo.close();
 * } catch (Exception e) {
 * System.out.println(e);
 * }
 * 
 * }
 * }
 * 
 */