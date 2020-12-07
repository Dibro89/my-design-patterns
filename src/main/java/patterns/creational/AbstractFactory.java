package patterns.creational;

import java.util.Optional;

public class AbstractFactory {

    static class Client {

        private final CoffeeFactory factory;

        public Client(CoffeeFactory factory) {
            this.factory = factory;
        }

        public Optional<Coffee> buyCoffee(int money) {
            if (money > 42) {
                return Optional.of(factory.createCoffee());
            }
            return Optional.empty();
        }
    }

    static abstract class CoffeeFactory {

        public abstract Coffee createCoffee();
    }

    static class FactoryWithCream extends CoffeeFactory {

        @Override
        public Coffee createCoffee() {
            return new CoffeeWithCream();
        }
    }

    static class FactoryWithSugar extends CoffeeFactory {

        @Override
        public Coffee createCoffee() {
            return new CoffeeWithSugar();
        }
    }

    interface Coffee {
    }

    static class CoffeeWithCream implements Coffee {
    }

    static class CoffeeWithSugar implements Coffee {
    }
}
