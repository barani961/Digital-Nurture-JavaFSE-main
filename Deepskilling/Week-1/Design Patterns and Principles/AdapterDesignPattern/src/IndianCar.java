public class IndianCar implements Car{
    private final String name;
    private final String model;
    private final String price;


    @Override
    public String getName() {
        return name;
    }

    public IndianCar(String name, String model, String price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getPrice() {
        return price;
    }

}
