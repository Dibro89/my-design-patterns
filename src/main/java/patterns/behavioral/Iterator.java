package patterns.behavioral;

public class Iterator {

    interface MyIterator<T> {

        boolean hasNext();

        T next();
    }

    static class CoffeeArrayIterator implements MyIterator<Coffee> {

        private final Coffee[] coffees;
        private int index;

        public CoffeeArrayIterator(Coffee... coffees) {
            this.coffees = coffees;
        }

        @Override
        public boolean hasNext() {
            return index < coffees.length;
        }

        @Override
        public Coffee next() {
            return coffees[index++];
        }
    }

    interface Coffee {
    }
}
