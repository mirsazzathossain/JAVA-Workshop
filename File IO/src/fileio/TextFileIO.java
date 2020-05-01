package fileio;

import java.io.*;
import java.util.Scanner;

public class TextFileIO {
    // Read byte from file and write byte to file
    static void write(){
        try {
            FileOutputStream fout = new FileOutputStream("write.txt");
            String dream = "OOP is a piece of cake for me now.\nI'm gonna show my skill while developing the project!";
            // Converting string into byte array
            byte[] b = dream.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    static void read(){
        try {
            FileInputStream fin = new FileInputStream("write.txt");
            int i;
            StringBuilder dream = new StringBuilder();
            while ((i = fin.read())!=-1){
                dream.append((char) i);
            }
            fin.close();
            System.out.println(dream);
        } catch (Exception exception) {
            System.out.print(exception);
        }
    }

    static void readAndWrite(){
        try {
            FileInputStream fin = new FileInputStream("write.txt");
            FileOutputStream fout = new FileOutputStream("test.txt");

            int i;
            while ((i = fin.read())!=-1){
                fout.write((byte)i);
            }
            fin.close();
            fout.close();
            System.out.println("Success...");
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }

    // Read character from file and write byte to file
    static void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("fwrite.txt");
        fileWriter.write("I love programming...");
        fileWriter.close();
        System.out.println("Success!");
    }

    static void fileReaderAndWriter() throws IOException {
        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("fwrite.txt");
            fileReader = new FileReader("write.txt");
            int c;
            while ((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }
        } finally {
            if(fileReader != null)
                fileReader.close();
            if(fileWriter != null)
                fileWriter.close();
        }
    }

    // Read byte and decode to char
    static void inputStreamReader() throws IOException {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream("test.txt"));

            while (inputStreamReader.ready()) {
                System.out.print((char) inputStreamReader.read());
            }
        } finally {
            if (inputStreamReader != null)
                inputStreamReader.close();
        }
    }

    // Another example of InputStreamReader
    static void inputStreamReaderExample() throws IOException {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);) {
            System.out.println("Enter characters, if you want to quit type 'q': ");
            for (char c; (c = (char)inputStreamReader.read()) != 'q';){
                System.out.print(c);
            }
        }
    }

    // ObjectInputStream and ObjectOutputStream
    static void objectStream() throws IOException, ClassNotFoundException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"))){
            Student student = new Student(1721809, "Mir Sazzat Hossain");
            objectOutputStream.writeObject(student);
            System.out.println("Success...");
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"))){
            Student student = (Student) objectInputStream.readObject();
            System.out.println("Name: "+student.name+"\nID: "+student.id);
        }
    }

    // Difference between close() and flush()
    static void closeAndFlush() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("close.txt");
        fileOutputStream.write("Hello".getBytes());
        // fileOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.write(" World!".getBytes());
        fileOutputStream.close();
        System.out.println("Success!");
    }

    // Buffered Writer
    static void bufferedWriter(String name, int id, double cgpa) throws IOException {
        String line = Integer.toString(id)+", "+name+", "+Double.toString(cgpa);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedWriter.txt", true))) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            System.out.println("Successfully written!");
        }
    }

    // Buffered Reader
    static void bufferedReader() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedWriter.txt"))){
            try {
                while (true) {
                    String[] tokens = bufferedReader.readLine().split(",\\s*");
                    System.out.println("ID: " + tokens[0] + " Name: " + tokens[1] + " CGPA: " + tokens[2]);
                }
            } catch (NullPointerException exception) { }
        }
    }

    // Read using scanner
    static void scannerReader() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("bufferedWriter.txt"));
        while (scanner.hasNextLine()){
            String[] tokens = scanner.nextLine().split(",\\s*");
            System.out.println("ID: " + tokens[0] + " Name: " + tokens[1] + " CGPA: " + tokens[2]);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // write();
        // read();
        // readAndWrite();
        /*
        try {
            fileWriter();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
         */
        /*
        try {
            fileReaderAndWriter();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
         */
        /*
        try {
            inputStreamReader();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
         */
        /*
        try {
            inputStreamReaderExample();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        */

        // objectStream();

        // closeAndFlush();
        // bufferedWriter("Mr. Abc", 1234567, 2.8);
        // bufferedWriter("Mr. Xyz", 7654321, 2.9);
        // bufferedReader();
        scannerReader();
    }
}

