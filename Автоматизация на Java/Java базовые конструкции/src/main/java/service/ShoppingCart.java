package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }
    public double getTotalPriceWithoutDiscount(){
    double totalPrice = 0;
    for (Food food : foods) {
        totalPrice = totalPrice + food.getAmount() * food.getPrice();
    }
    return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            if (food instanceof Discountable) {
            totalPrice = totalPrice + food.getAmount() * food.getPrice() * (1 - ((Discountable) food).getDiscount() / 100);
        } else {
                totalPrice = totalPrice + food.getAmount() * food.getPrice();
            }
        }
        return totalPrice;
    }
    public double getTotalPriceVegetarian(){
        double totalPrice = 0;
        for (Food food : foods){
            if (food.isVegetarian()) {
                totalPrice = totalPrice + food.getAmount() * food.getPrice();
            }
        }
        return totalPrice;
    }
}


