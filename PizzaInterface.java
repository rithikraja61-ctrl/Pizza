public interface PizzaInterface extends BasicFunctionalitiesInterface{
    public int getPrice();
    public void setPrice(int price);
    void orderPizza(int size);
    void cancelPizza();
}
