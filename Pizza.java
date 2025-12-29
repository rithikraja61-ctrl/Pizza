public class Pizza extends BasicFunctionalities implements PizzaInterface{
    private int price;
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   public  void orderPizza(int size)
    {
        this.setTotalPrice(this.getPrice()*size);
        System.out.println("Pizza ordered");
        System.out.print(" Price  :");
        System.out.print(this.getTotalPrice());
        System.out.println();
    }
   public void cancelPizza()
    {
        System.out.println("Pizza Canceled");
    }
}
