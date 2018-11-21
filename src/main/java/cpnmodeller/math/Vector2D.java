package cpnmodeller.math;

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
}
