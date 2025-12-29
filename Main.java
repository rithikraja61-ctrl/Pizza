/*

Problem Statement:
Create a pizza ordering app:

1} Customer.java
* orderId, price, pizzaType, size
* getters/setters
2}RegularPizza.java
* orderId, price
* orderPizza(int size), cancelPizza()
* Unique: addExtraToppings() → prints "Extra Toppings Added"
3}PremiumPizza.java
* orderId, price
* orderPizza(int size), cancelPizza()
* Unique: addGourmetCrust() prints "Gourmet Crust Added"
4} Main.java
* Create 2 Customers (1 REGULAR, 1 PREMIUM)
* Use if-condition to route
* Call unique method for each
TO DO:
First create 3 entity called premium pizza regular pizza customer
Regular pizza and Premium Pizza have OrderPizza and Cancel pizza method
both have unique method
Customer have pizza type
put common code of pizza in pizza class and pizza and costumer common code
BasicFunctionalities to give secure using Interface

 */

public class Main {
    public static void main(String args[])
    {
        CustomerInterface c1=new Customer();
        CustomerInterface c2=new Customer();
        c1.setOrderId(124);
        c2.setOrderId(998);
        PremiumPizzaInterface premium=new PremiumPizza(c2);
        RegularPizzaInterface regular=new RegularPizza(c1);
        c1.setPizzaType("RegularPizza");
        c2.setPizzaType("PremiumPizza");
        c1.setSize(10);
        c2.setSize(12);
        regular.setPrice(100);
        premium.setPrice(200);
        if(c1.getPizzaType().equals("RegularPizza"))
        {
            System.out.println("===== CUSTOMER 1: REGULAR =====");
          regular.orderPizza(c1.getSize());
          regular.addExtraToppings("pepperoni");
        }
       else if(c2.getPizzaType().equals("RegularPizza"))
        {
            System.out.println("===== CUSTOMER 2: REGULAR =====");
            regular.orderPizza(c1.getSize());
            regular.addExtraToppings();

        }
        if(c1.getPizzaType().equals("PremiumPizza"))
        {
            System.out.println("===== CUSTOMER 1: PREMIUM =====");
          premium.orderPizza(c1.getSize());
          premium.addGourmetCrust();
        }
        else if(c2.getPizzaType().equals("PremiumPizza"))
        {
            System.out.println("===== CUSTOMER 2: PREMIUM =====");
            premium.orderPizza(c2.getSize());
            premium.addGourmetCrust();
        }
    }
}
