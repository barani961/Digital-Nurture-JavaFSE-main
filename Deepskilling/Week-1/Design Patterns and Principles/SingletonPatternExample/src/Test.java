
public class Test {
    public static void main(String[] args) {
           //System.out.println( "implemented SingleTon Pattern and created instance  "+Logger.getInstance());

        Logger obj1=Logger.getInstance();
        Logger obj2=Logger.getInstance();
        Logger obj3=Logger.getInstance();

        if(obj1==obj2 && obj1==obj3)
            System.out.println("Using SingleTon Pattern only one instance is created and verified ");

        }
    }
