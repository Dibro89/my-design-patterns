package patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    static class Controller {

        private final ListView listView;
        private final Label label;

        public Controller() {
            this.listView = new ListView(this);
            this.label = new Label();
        }

        public void onItemSelected(Item item) {
            label.setText(item.getText());
        }
    }

    interface Component {
    }

    static class ListView implements Component {

        private final Controller controller;
        private final List<Item> items;

        public ListView(Controller controller) {
            this.controller = controller;
            this.items = new ArrayList<>();
        }

        public void handleClick() {
            // ... magic
            // ...
            int index = 42;

            controller.onItemSelected(items.get(index));
        }

        public void addItem(Item item) {
            items.add(item);
        }
    }

    static class Label  implements Component {

        public void setText(String text) {
            // more magic
        }
    }

    static class Item {

        private final String text;

        public Item(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
