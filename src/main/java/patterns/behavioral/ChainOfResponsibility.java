package patterns.behavioral;

import java.util.Set;

public class ChainOfResponsibility {

    interface Coffee {

        Set<String> getRequiredIngredients();
    }

    interface IngredientFilter {

        boolean canSupply(Coffee coffee);
    }

    static class NoSugarFilter implements IngredientFilter {

        private IngredientFilter next;

        @Override
        public boolean canSupply(Coffee coffee) {
            if (coffee.getRequiredIngredients().contains("sugar")) {
                return false;
            }
            if (next != null) {
                return next.canSupply(coffee);
            }
            return true;
        }

        public void setNext(IngredientFilter next) {
            this.next = next;
        }
    }
}
