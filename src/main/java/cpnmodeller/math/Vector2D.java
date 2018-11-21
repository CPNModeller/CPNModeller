package cpnmodeller.math;

public final class Vector2D {

    public final float x;
    public final float y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(
                x + other.x,
                y + other.y
        );
    }

    public Vector2D subtract(Vector2D other) {
        return new Vector2D(
                x - other.x,
                y - other.y
        );
    }

    public Vector2D multiply(Vector2D other) {
        return new Vector2D(
                x * other.x,
                y * other.y
        );
    }

    public Vector2D divide(Vector2D other) {
        return new Vector2D(
                x / other.x,
                y / other.y
        );
    }
}
