package patterns.structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flyweight {

    static class Coffee {

        private final CoffeeRecipe recipe;

        public Coffee(String recipeName) {
            this.recipe = CoffeeRecipeManager.getRecipe(recipeName);
        }

        public CoffeeRecipe getRecipe() {
            return recipe;
        }
    }

    static class CoffeeRecipeManager {

        private static final Map<String, CoffeeRecipe> cache = new HashMap<>();

        public static CoffeeRecipe getRecipe(String name) {
            return cache.computeIfAbsent(name, CoffeeRecipeManager::loadRecipe);
        }

        private static CoffeeRecipe loadRecipe(String name) {
            throw new UnsupportedOperationException();
        }
    }

    interface CoffeeRecipe {

        List<VeryBigImage> getPages();
    }

    interface VeryBigImage {
    }
}
