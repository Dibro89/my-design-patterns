package patterns.structural;

import java.util.HashSet;
import java.util.Set;

public class Composite {

    static class TreeNode {

        private final String name;
        private final Set<TreeNode> children;

        public TreeNode(String name) {
            this.name = name;
            this.children = new HashSet<>();
        }

        public void addNode(TreeNode node) {
            children.add(node);
        }

        public void printPreorder() {
            printPreorder(0);
        }

        public void printPreorder(int spaces) {
            System.out.println(" ".repeat(spaces) + "node: " + name);
            for (TreeNode child : children) {
                child.printPreorder(spaces + 1);
            }
        }
    }
}
