public class ForiegnCarAdapter implements Car {


    private final ForiegnCar foriegnCar;

    public ForiegnCarAdapter(ForiegnCar foriegnCar) {
        this.foriegnCar = foriegnCar;
    }

    @Override
    public String getModel() {
        return foriegnCar.getBrandModel();
    }


    @Override
    public String getName() {
        return foriegnCar.GetCarName();
    }

    @Override
    public String getPrice() {
        return foriegnCar.getModelPrice();
    }
}
