public class ForiegnCar {
    private final String BrandName;
    private final String BrandModel;
    private final String ModelPrice;

    public ForiegnCar(String brandName, String brandModel, String modelPrice) {
        this.BrandName = brandName;
        this.BrandModel = brandModel;
        this.ModelPrice = modelPrice;
    }

    public String GetCarName() {
        return this.BrandName;
    }

    public String getBrandModel() {
        return this.BrandModel;
    }

    public String getModelPrice() {
        return this.ModelPrice;
    }
}
