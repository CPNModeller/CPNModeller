package cpnmodeller.gui.grapheditor;

import cpnmodeller.math.Vector2D;
import cpnmodeller.petrinet.Node;

import java.util.LinkedList;
import java.util.List;

public final class NodeCollection {
    private final List<Node> nodes = new LinkedList<>();

    public void add(Node node) {
        nodes.add(node);
    }

    public void remove(Node node) {
        nodes.remove(node);
    }

    public <T extends Node> T find(Vector2D position) {
        for (Node node : nodes) {
            if (node.getPosition().equals(position)) {
                return (T) node;
            }
        }

        return null;
    }
}
