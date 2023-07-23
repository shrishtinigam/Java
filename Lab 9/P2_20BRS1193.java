import java.io.*;

public class P2_20BRS1193 {
    public static void main(String args[]) {
        byte[] fileArray = new byte[1300];
        int byteCount = 0;
        try {
            FileInputStream fr = new FileInputStream("Input.txt");
            byteCount = fr.available();
            fr.read(fileArray);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

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

        System.out.println("Byte count: " + byteCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);

        String outputString = "Byte count: " + byteCount + "\nWord count: " + wordCount + "\nSentence count: "
                + sentenceCount;

        try {
            OutputStream out = new FileOutputStream("Output.txt");
            byte[] dataBytes = outputString.getBytes();
            out.write(dataBytes);
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
