package patterns.structural;

import java.util.HashSet;
import java.util.Set;

public class Proxy {

    interface Coffee {

        Set<String> getIngredients();

        void addIngredient(String ingredient);
    }

    static class SimpleCoffee implements Coffee {

        private final Set<String> ingredients = new HashSet<>();

        @Override
        public Set<String> getIngredients() {
            return ingredients;
        }

        @Override
        public void addIngredient(String ingredient) {
            ingredients.add(ingredient);
        }
    }

    static class CoffeeWithoutSugar implements Coffee {

        private final Coffee coffee = new SimpleCoffee();

        @Override
        public Set<String> getIngredients() {
            return coffee.getIngredients();
        }

        @Override
        public void addIngredient(String ingredient) {
            if (!ingredient.equals("sugar")) {
                coffee.addIngredient(ingredient);
            }
        }
    }
}
