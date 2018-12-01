package cpnmodeller.math;

import java.util.Objects;

public final class Vector2D {

    public final float x;
    public final float y;

    public Vector2D(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(final Vector2D other) {
        return new Vector2D(
                x + other.x,
                y + other.y
        );
    }

    public Vector2D subtract(final Vector2D other) {
        return new Vector2D(
                x - other.x,
                y - other.y
        );
    }

    public Vector2D multiply(final Vector2D other) {
        return new Vector2D(
                x * other.x,
                y * other.y
        );
    }

    public Vector2D divide(final Vector2D other) {
        return new Vector2D(
                x / other.x,
                y / other.y
        );
    }

    public Vector2D scale(final Vector2D scale) {
        return new Vector2D(
                x * (1 / scale.x),
                y * (1 / scale.y)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2D)) return false;
        Vector2D vector2D = (Vector2D) o;
        return Float.compare(vector2D.x, x) == 0 &&
                Float.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("Vec{x=%s, y=%s}", x, y);
    }
}
