package Basic;

import java.io.*;

//TASK 8 :Create class and serialize it; print result; deserialize it; print result; // for JS serialize to JSON

class Task8 implements java.io.Serializable {

    public int a;
    public String b;

    // Default constructor
    public Task8(int a, String b) {
        this.a = a;
        this.b = b;
    }

}

class Test {
    public static void main(String[] args) {
        Task8 object = new Task8(1, "one");
        String filename = "file.name";

        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }


        Task8 object1 = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Task8) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
