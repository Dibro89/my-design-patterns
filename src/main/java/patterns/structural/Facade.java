package patterns.structural;

import java.util.HashSet;
import java.util.Set;

public class Facade {

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

    static class CreamAdder {

        public void addCream(Coffee coffee) {
            coffee.addIngredient("cream");
        }
    }

    static class SugarAdder {

        public void addSugar(Coffee coffee) {
            coffee.addIngredient("sugar");
        }
    }

    static class CoffeeMaker {

        public Coffee makeCoffee(boolean cream, boolean sugar) {
            Coffee coffee = new SimpleCoffee();

            if (cream) {
                CreamAdder creamAdder = new CreamAdder();
                creamAdder.addCream(coffee);
            }

            if (sugar) {
                SugarAdder sugarAdder = new SugarAdder();
                sugarAdder.addSugar(coffee);
            }

            return coffee;
        }
    }
}
