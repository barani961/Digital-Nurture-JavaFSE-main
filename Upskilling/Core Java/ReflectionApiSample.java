import java.lang.reflect.*;

public class ReflectionApiSample {

    public void show(String name,int age) {

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public void display() {

        System.out.println("Reflection API Example");
    }

    public static void main(String[] args) {

        try {

            Class<?> c=Class.forName("ReflectionApiSample");

            Object obj=c.getDeclaredConstructor().newInstance();

            Method methods[]=c.getDeclaredMethods();

            for(Method m:methods) {

                System.out.println("Method Name : "+m.getName());

                Class<?> params[]=m.getParameterTypes();

                System.out.print("Parameters : ");

                for(Class<?> p:params) {

                    System.out.print(p.getName()+" ");
                }

                System.out.println("\n");
            }

            Method method=
                    c.getDeclaredMethod(
                            "show",
                            String.class,
                            int.class);

            method.invoke(obj,"Raghu",25);

        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}