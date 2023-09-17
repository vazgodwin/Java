package Advanced.Generics;

public class Student {
    public int age;
    public String name;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return ("Name: "+name+" Age: "+age);
    }
}
