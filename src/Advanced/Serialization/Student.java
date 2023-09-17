package Advanced.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionID=1L;

    private String name;
    private int age;
    private String address;

    Student(String name,int age,String address){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString(){
        return ("Name: "+this.getName()+"\nAge: "+age+"\nAddress: "+this.address);
    }
}
