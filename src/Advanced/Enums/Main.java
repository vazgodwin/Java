package Advanced.Enums;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Color c=Color.RED;
        Color c2=Color.GREEN;
        System.out.println(c.name());
        System.out.println(c.getValue());

        for(Color c3:Color.values()){
            System.out.println(c3.getValue());
            System.out.println(c3.name());
        }
    }
}
