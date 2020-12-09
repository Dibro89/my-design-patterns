package patterns.behavioral;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Observer {

    interface IngredientListener {

        void onIngredientAdded(String ingredient);
    }

    static class Coffee {

        private final Set<String> ingredients;
        private final List<IngredientListener> listeners;

        public Coffee() {
            this.ingredients = new HashSet<>();
            this.listeners = new ArrayList<>();
        }

        public void addIngredient(String ingredient) {
            if (!ingredients.add(ingredient)) {
                return;
            }

            for (IngredientListener listener : listeners) {
                listener.onIngredientAdded(ingredient);
            }
        }

        public void addListener(IngredientListener listener) {
            listeners.add(listener);
        }
    }
}
