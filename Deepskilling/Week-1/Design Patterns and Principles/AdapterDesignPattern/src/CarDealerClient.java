import java.util.ArrayList;
import java.util.List;

public class CarDealerClient {

    public List<Car>getCarList()
    {
        List<Car> carList = new ArrayList<>();
        Car car1=new IndianCar("Tata","Punch","1,20,000");
        ForiegnCar car2=new ForiegnCar("Kia","Crysta","1234455");
        carList.add(car1);
        carList.add(new ForiegnCarAdapter(car2));
        return carList;
    }


}
