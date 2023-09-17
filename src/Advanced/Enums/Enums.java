package Advanced.Enums;

class Enums{
    public static void main(String[] args) {
        System.out.println("This is the enum class");
    }
}

enum Color{
    RED("red"), GREEN("green");
    private final String value;
    Color(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}

