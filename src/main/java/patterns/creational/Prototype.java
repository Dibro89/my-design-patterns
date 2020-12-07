package patterns.creational;

public class Prototype {

    static abstract class Beverage {

        public abstract Beverage copy();
    }

    static class Coffee extends Beverage {

        private boolean cream;
        private boolean sugar;

        public Coffee() {
        }

        public boolean hasCream() {
            return cream;
        }

        public void setCream(boolean cream) {
            this.cream = cream;
        }

        public boolean hasSugar() {
            return sugar;
        }

        public void setSugar(boolean sugar) {
            this.sugar = sugar;
        }

        @Override
        public Coffee copy() {
            Coffee ret = new Coffee();
            ret.setCream(hasCream());
            ret.setSugar(hasSugar());
            return ret;
        }
    }
}
