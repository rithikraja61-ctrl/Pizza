public class RegularPizza extends Pizza implements RegularPizzaInterface{
 private CustomerInterface c;

    RegularPizza(CustomerInterface c)
  {
      this.c=c;
      this.setOrderId(c.getOrderId());
  }
   //OverLoading Method
    public void addExtraToppings()
    {
        System.out.println("Extra Topping Added");
    }
    public void addExtraToppings(String topping)
    {
        System.out.print(topping);
        System.out.print("  Topping Added\n");
    }
}
