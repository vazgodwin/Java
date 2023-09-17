package Advanced.Annotation;

import java.lang.reflect.Method;

@SuppressWarnings({"unused","SpellCheckingInspection"})
public class Main {
    public static void main(String[] args) throws Exception {
        Annotation an=new Annotation();
        System.out.println(an.getClass().isAnnotationPresent(goddyWarning.class));

        for(Method method:an.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(goddyWarning.class)){
                goddyWarning annvalue=method.getAnnotation(goddyWarning.class);
                System.out.println(annvalue.value());
                method.invoke(an);
            }
        }
        Method m=an.getClass().getMethod("display");
        m.invoke(an);
        System.out.println(m.getName());

    }
}
