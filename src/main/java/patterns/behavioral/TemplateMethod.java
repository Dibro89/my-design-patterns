package patterns.behavioral;

public class TemplateMethod {

    static abstract class CoffeeMaker {

        public void makeCoffee() {
            getCup();
            addCoffee();
            pourWater();
        }

        protected abstract void getCup();

        protected abstract void addCoffee();

        protected abstract void pourWater();
    }

    interface Coffee {
    }
}
