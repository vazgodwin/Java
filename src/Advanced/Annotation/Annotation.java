package Advanced.Annotation;
@goddyWarning(value =10)
@SuppressWarnings({"unused","SpellCheckingInspection"})
public class Annotation {
    @goddyWarning(value =10)
    public void display(){
        System.out.println("Its the display");
    }
    public void printdis(){
        System.out.println("Its the printdis");
        return;
    }
}
