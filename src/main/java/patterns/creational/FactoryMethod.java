package patterns.creational;

import java.util.Optional;

public class FactoryMethod {

    static abstract class CoffeeMethod {

        public Optional<Coffee> buyCoffee(int money) {
            if (money > 42) {
                return Optional.of(createCoffee());
            }
            return Optional.empty();
        }

        protected abstract Coffee createCoffee();
    }

    static class MethodWithCream extends CoffeeMethod {

        @Override
        protected Coffee createCoffee() {
            return new CoffeeWithCream();
        }
    }

    static class MethodWithSugar extends CoffeeMethod {

        @Override
        protected Coffee createCoffee() {
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
