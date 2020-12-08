package patterns.structural;

public class Bridge {

    interface Drink {

        boolean hasSugar();

        void addSugar();

        void mix();

        void beforeSugarAdded();

        void afterSugarAdded();
    }

    interface CoffeeMachine {

        void withSugar();
    }

    static class SimpleCoffeeMachine implements CoffeeMachine {

        private final Drink drink;

        public SimpleCoffeeMachine(Drink drink) {
            this.drink = drink;
        }

        @Override
        public void withSugar() {
            if (!drink.hasSugar()) {
                // some complex logic
                drink.beforeSugarAdded();
                drink.addSugar();
                drink.mix();
                drink.afterSugarAdded();
            }
        }
    }
}
