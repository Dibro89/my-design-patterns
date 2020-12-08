package patterns.structural;

import java.util.HashSet;
import java.util.Set;

public class Decorator {

    interface Coffee {

        Set<String> getIngredients();
    }

    static class SimpleCoffee implements Coffee {

        @Override
        public Set<String> getIngredients() {
            return Set.of("coffee");
        }
    }

    static class CoffeeWithCream implements Coffee {

        private final Coffee coffee;

        public CoffeeWithCream(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public Set<String> getIngredients() {
            Set<String> ingredients = new HashSet<>(coffee.getIngredients());
            ingredients.add("cream");
            return ingredients;
        }
    }

    static class CoffeeWithSugar implements Coffee {

        private final Coffee coffee;

        public CoffeeWithSugar(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public Set<String> getIngredients() {
            Set<String> ingredients = new HashSet<>(coffee.getIngredients());
            ingredients.add("sugar");
            return ingredients;
        }
    }
}
