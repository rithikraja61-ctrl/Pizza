public class PremiumPizza extends Pizza implements PremiumPizzaInterface{
    CustomerInterface c;
    PremiumPizza(CustomerInterface c)
    {
        this.c=c;
        this.setOrderId(c.getOrderId());
    }
    public void addGourmetCrust()
    {
        System.out.println("Gourmet Crust added");
    }
    @Override
    public  void orderPizza(int size)
    {
        this.setTotalPrice(this.getPrice()*size);
        System.out.println("Order Id of Premium Pizza :");
        System.out.print(this.getOrderId());
        System.out.print(" \nPrice :");
        System.out.print(this.getTotalPrice());
        System.out.println();
    }
}
