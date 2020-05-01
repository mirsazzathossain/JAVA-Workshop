package driver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Throws {
    public static void writeToFile () throws IOException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))){
            bufferedWriter.write("Hello World!");
            System.out.println("Successfully Written!");
        }
    }
}
