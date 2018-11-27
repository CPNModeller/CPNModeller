package cpnmodeller.petrinet;

import cpnmodeller.math.Vector2D;

import java.util.Objects;

public abstract class Node {
    private Vector2D position;
    private String label;

    public Node(Vector2D position, String label) {
        this.position = position;
        this.label = label;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(position, node.position) &&
                Objects.equals(label, node.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, label);
    }
}
