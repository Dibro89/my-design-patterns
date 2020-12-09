package patterns.behavioral;

public class Visitor {

    interface DrinkVisitor {

        void visitTea(Tea tea);

        void visitCoffee(Coffee coffee);
    }

    interface Drink {

        void accept(DrinkVisitor visitor);
    }

    static class Tea implements Drink {

        @Override
        public void accept(DrinkVisitor visitor) {
            visitor.visitTea(this);
        }
    }

    static class Coffee implements Drink {

        @Override
        public void accept(DrinkVisitor visitor) {
            visitor.visitCoffee(this);
        }
    }
}
