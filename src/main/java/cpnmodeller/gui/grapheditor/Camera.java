package cpnmodeller.gui.grapheditor;

import cpnmodeller.math.Vector2D;

import java.awt.*;

public final class Camera {
    private Vector2D translation = new Vector2D(0, 0);
    private float scale = 1f;

    public void translate(Vector2D t) {
        translation = translation.add(t);
    }

    public void zoom(float delta) {
        scale += delta;
    }

    public void apply(Graphics2D g) {
        g.translate(-translation.x, -translation.y);
        g.scale(scale, scale);
    }

    public Vector2D apply(Vector2D point) {
        return translation.subtract(point).scale(point);
    }

    public Vector2D getTranslation() {
        return translation;
    }
}
