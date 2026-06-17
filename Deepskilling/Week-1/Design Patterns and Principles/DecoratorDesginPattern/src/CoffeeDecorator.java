public abstract class CoffeeDecorator extends Coffee{

     protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getPrice() {
        return coffee.getPrice();
    }
}
