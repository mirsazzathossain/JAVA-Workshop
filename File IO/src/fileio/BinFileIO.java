package fileio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinFileIO {

    static void dataStream() throws IOException {
        double[] prices = {70.67, 50.54, 3.36, 8.98, 5.56};
        String[] products = {"Java T-shirts",
                             "Java Mug",
                             "Java Pen",
                             "Java Pin",
                             "Java Key Chain"};
        int[] unites = {12, 8, 11, 20, 10};

        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")))) {
            for (int i = 0; i < 5; i++) {
                dataOutputStream.writeUTF(products[i]);
                dataOutputStream.writeDouble(prices[i]);
                dataOutputStream.writeInt(unites[i]);
            }
            System.out.println("Writing successful!");
        }

        try(DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")))){
            while (dataInputStream.available() != 0){
                System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble() + " " + dataInputStream.readInt());
            }
        }
    }

    static void objectStream() throws IOException, ClassNotFoundException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.bin"))){
            Student student = new Student(1721809, "Mir Sazzat Hossain");
            objectOutputStream.writeObject(student);
            System.out.println("Success!");
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.bin"))){
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.id + " " + student.name);
        }
    }

    // Appending object to a binary file
    static void appendObject(Student student) throws IOException {
        File file = new File("appendObject.bin");
        if(!file.exists()) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("appendObject.bin"))) {
                objectOutputStream.writeObject(student);
            }
        }
        else {
            try(ObjectOutputStream appendableObjectOutputStream = new AppendableObjectOutputStream(new FileOutputStream("appendObject.bin", true))){
                appendableObjectOutputStream.writeObject(student);
            }
        }
    }

    static void read() throws IOException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("appendObject.bin"))){
            try {
                while (true) {
                    Student student = (Student) objectInputStream.readObject();
                    System.out.println(student.id + " " + student.name);
                }
            } catch (EOFException exception) {
                // System.out.println(exception);
                // Logger.getLogger(BinFileIO.class.getName()).log(Level.SEVERE, null, exception);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // dataStream();
        // objectStream();

        // Student student1 = new Student(7654321, "Mr. XYZ");
        // Student student2 = new Student(1234567, "Mr. Abc");
        // appendObject(student1);
        // appendObject(student2);
        read();

    }
}

class AppendableObjectOutputStream extends ObjectOutputStream{
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}


