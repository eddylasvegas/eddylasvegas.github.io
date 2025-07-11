import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple (8, 60, Colour.GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart (foods);

        System.out.printf("Общая сумма товаров без скидки: " + shoppingCart.getTotalPriceWithoutDiscount() + "%n");
        System.out.printf("Общая сумма товаров со скидкой: " + shoppingCart.getTotalPriceWithDiscount() + "%n");
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalPriceVegetarian() + "%n");
    }
}
