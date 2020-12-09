package patterns.behavioral;

public class Strategy {

    interface CoffeeMaker {

        void makeCoffee();

        void addSugar(Coffee coffee);
    }

    static class CoffeeMachine implements CoffeeMaker {

        @Override
        public void makeCoffee() {
        }

        @Override
        public void addSugar(Coffee coffee) {
        }
    }

    static class NotCoffeeMachine implements CoffeeMaker {

        @Override
        public void makeCoffee() {
        }

        @Override
        public void addSugar(Coffee coffee) {
        }
    }

    interface Coffee {
    }
}
