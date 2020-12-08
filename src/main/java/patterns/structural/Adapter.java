package patterns.structural;

public class Adapter {

    interface Coffee {

        boolean hasCream();

        boolean hasSugar();
    }

    interface Drink {

        boolean isSweet();
    }

    static class CoffeeDrink implements Drink {

        private final Coffee coffee;

        public CoffeeDrink(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public boolean isSweet() {
            return coffee.hasSugar();
        }
    }
}
