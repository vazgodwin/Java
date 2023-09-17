package Advanced.Serialization;

import java.io.*;

@SuppressWarnings("SpellCheckingInspection")
public class Main {
    public static void main(String[] args) {
        Student s=new Student("Godwin",22,"Gomesali");
        String filename="C:\\Users\\GODWIN\\IdeaProjects\\JavaProject\\src\\Advanced\\Serialization\\Test.txt";

        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(filename);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized:\n"+ s);
        }
        catch (IOException ioException){
            System.out.println("Exception is caught");
        }

        //DeSerialization
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;

        try{
            fileInputStream=new FileInputStream(filename);
            objectInputStream=new ObjectInputStream(fileInputStream);

            Student stu=(Student) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println("\nObject has been Deserialized:\n"+ stu);

        }
        catch (IOException ioException){
            System.out.println("io exception");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
    }
}
