import java.util.List;


public class Main {
    public static void main(String[] args) {
        CarDealerClient client =new CarDealerClient();

        List<Car>cars=client.getCarList();
        for(Car car : cars){
            System.out.println("car name: "+car.getName()+"\n model: "+car.getModel()+"\n price: "+car.getModel());
            System.out.println();
        }
    }
}