package patterns.behavioral;

public class State {

    interface Screen {

        void render();
    }

    static class ScreenManager {

        private Screen screen;

        public void render() {
            if (screen != null) {
                screen.render();
            }
        }

        public void setScreen(Screen screen) {
            this.screen = screen;
        }
    }
}
