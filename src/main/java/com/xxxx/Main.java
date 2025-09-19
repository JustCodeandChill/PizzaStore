package com.xxxx;

import com.xxxx.models.Burger.Burger;
import com.xxxx.models.Burger.BurgerFactory;
import com.xxxx.models.Drink.Drink;
import com.xxxx.models.Drink.DrinkFactory;
import com.xxxx.models.Order.Order;
import com.xxxx.models.Order.OrderBuilder;
import com.xxxx.models.Pizza.Pizza;
import com.xxxx.models.Pizza.PizzaFactory;
import com.xxxx.models.PizzaStore;
import com.xxxx.models.Sub.BeefSub;
import com.xxxx.models.Sub.Sub;
import com.xxxx.models.Topping.Topping;
import com.xxxx.models.Topping.ToppingFactory;

import java.util.Scanner;

public class Main {
    private static OrderBuilder orderBuilder;
    private static Scanner scanner;

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        orderBuilder = OrderBuilder.createOrderBuilder();
        scanner = new Scanner(System.in);
        Order order;


        // The main program starts here.
        boolean inOrder = true;
        printMenu();

        while (inOrder) {
            printActionable();
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    orderBuilder = OrderBuilder.createOrderBuilder();
                    System.out.println("You have created a new order");
                    System.out.println("___________________________________");
                    break;
                case 2:
                    printOrderOptions();
                    handleAddToOrder();
                    System.out.println("___________________________________");
                    break;
                case 3:
                    System.out.println("You now submit your order");
                    if (orderBuilder.getOrder() != null) {
                        orderBuilder.build();
                    } else {
                        System.out.println("You have not created an order. Please choose option 1 to start");
                    }
                    System.out.println("___________________________________");
                    break;
                case 4:
                    order = orderBuilder.getOrder();
                    System.out.println(order.getTotalPriceInString());
                    System.out.println("___________________________________");
                    break;
                case 5:
                    inOrder = false;
                    break;
                default:
                    System.out.println("Invalid action");
                    System.out.println("___________________________________");
            }
        }

        order = orderBuilder.getOrder();
        pizzaStore.setOrder(order);
        System.out.println("Your order is: " + pizzaStore.getOrder().toString());
        System.out.println(pizzaStore.getOrder().getTotalPriceInString());

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Hello welcome to our pizza store. This is the list of our menu");
        System.out.println("1. Pizza: small-5, medium-10, large-15");
        System.out.println("2. Burger: small-2, large-4");
        System.out.println("3. Sub: beef-6, chicken-5, veggie-4");
        System.out.println("4. Topping: beef-2, cheese-1, onions-1");
        System.out.println("5. Drink: coke-2, drpepper-2");

    }

    public static void printActionable() {
        System.out.println("\nPlease select your actions");
        System.out.println("1. Create an order");
        System.out.println("2. Add to order");
        System.out.println("3. Finish order");
        System.out.println("4. Get total price");
        System.out.println("5. Exit");
    }

    public static void printOrderOptions() {
        System.out.println("Please select your food to add.");
        System.out.println("If you select invalid choice. THE OPTION WILL NOT BE ADDED");
        System.out.println("Press 1 for Pizza. Then select the size using lowercase characters");
        System.out.println("s - Small size, m - medium, l - large");
        System.out.println("Press 2 for Burger. Then select the size using lowercase characters");
        System.out.println("s - Small size, l - large");
        System.out.println("Press 3 for Sub. Then select the type using lowercase characters");
        System.out.println("b - Beef, c- chicken, v - veggie");
        System.out.println("Press 4 for Topping. Then select the type of topping using lowercase characters");
        System.out.println("b - Beef, c- cheese, o - onions");
        System.out.println("Press 5 for Drink. Then select the type of drink using lowercase characters");
        System.out.println("c - Coke, d - DrPepper, w - Water");
    }

    // using conditional statement to handle adding to order
    public static void handleAddToOrder() {
        // ask for food and their subtypes  to add food to order accordingly
        int food = scanner.nextInt();
        scanner.nextLine();
        String size = "";
        switch (food) {
            case 1:
                System.out.println("Please select the size of pizza");
                size = scanner.nextLine();
                System.out.println("you choose " + size);
                Pizza pizza = PizzaFactory.createPizza(size);
                orderBuilder.addPizza(pizza);
                break;
            case 2:
                System.out.println("Please select the size of burger");
                size = scanner.nextLine();
                Burger burger = BurgerFactory.createBurger(size);
                orderBuilder.addBurger(burger);
                break;
            case 3:
                System.out.println("Please select the type of sub");
                String subType = scanner.nextLine();
                Sub sub = BeefSub.SubFactory.createSub(subType);
                orderBuilder.addSub(sub);
                break;
            case 4:
                System.out.println("Please select One type of topping");
                String toppingType = scanner.nextLine();
                Topping topping = ToppingFactory.createTopping(toppingType);
                orderBuilder.addTopping(topping);
                break;
            case 5:
                System.out.println("Please select One type of drink");
                String drinkType = scanner.nextLine();
                Drink drink = DrinkFactory.createDrink(drinkType);
                orderBuilder.addDrink(drink);
                break;
            default:
                System.out.println("Invalid choice. Not adding anything");
        }
    }

}