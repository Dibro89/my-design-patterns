package patterns.creational;

public class Builder {

    static class Coffee {

        private final boolean cream;
        private final boolean sugar;

        private Coffee(boolean cream, boolean sugar) {
            this.cream = cream;
            this.sugar = sugar;
        }

        @Override
        public String toString() {
            return "Coffee{" +
                    "cream=" + cream +
                    ", sugar=" + sugar +
                    '}';
        }

        public static CoffeeBuilder newBuilder() {
            return new CoffeeBuilder();
        }

        public static class CoffeeBuilder {

            private boolean cream;
            private boolean sugar;

            private CoffeeBuilder() {
            }

            public CoffeeBuilder addCream() {
                cream = true;
                return this;
            }

            public CoffeeBuilder addSugar() {
                sugar = true;
                return this;
            }

            public Coffee build() {
                return new Coffee(cream, sugar);
            }
        }
    }
}
