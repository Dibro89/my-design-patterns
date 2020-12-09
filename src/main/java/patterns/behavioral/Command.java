package patterns.behavioral;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Command {

    interface MyCommand {

        void execute(String[] args);
    }

    static class CommandGroup implements MyCommand {

        private final Map<String, MyCommand> commands;

        public CommandGroup() {
            this.commands = new LinkedHashMap<>();
        }

        public void registerCommand(String name, MyCommand command) {
            commands.put(name, command);
        }

        @Override
        public void execute(String[] args) {
            if (args.length == 0) {
                printHelp();
                return;
            }

            MyCommand command = commands.get(args[0]);

            if (command == null) {
                printHelp();
                return;
            }

            command.execute(Arrays.copyOfRange(args, 1, args.length));
        }

        public void printHelp() {
            String keys = String.join(", ", commands.keySet());
            System.out.println("available commands: " + keys);
        }
    }
}
