package patterns.behavioral;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Memento {

    static class Coffee implements Serializable {

        private final Set<String> ingredients;

        public Coffee() {
            this.ingredients = new HashSet<>();
        }

        public void addIngredient(String ingredient) {
            ingredients.add(ingredient);
        }

        @Override
        public String toString() {
            return "Coffee{" +
                    "ingredients=" + ingredients +
                    '}';
        }

        public byte[] getBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(this);
                objectOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static Coffee fromBytes(byte[] buf) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                return (Coffee) objectInputStream.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
