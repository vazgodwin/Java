package Advanced.Generics;

public class Generics<T,U> {
    T student1;
    U student2;

    public Generics(T student1,U student2) {
        this.student1=student1;
        this.student2=student2;
    }

    public void display(){
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

    public static void main(String[] args) {
        Student st1=new Student("Godwin",22);
        Student st2=new Student("Liviya",20);
        Generics<Student,Student> gen= new Generics<>(st1,st2);
        gen.display();
    }
}
