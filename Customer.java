public class Customer extends BasicFunctionalities implements CustomerInterface{
   private int size;
   private String pizzaType;
   public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

}
