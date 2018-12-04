package cpnmodeller.gui.grapheditor;

import cpnmodeller.math.Vector2D;

import java.awt.*;

public final class Camera {
    private final float minZoom;
    private final float maxZoom;

    private Vector2D translation = new Vector2D(0, 0);
    private float scale = 1f;

    public Camera() {
        this(0.4f, 2.5f);
    }

    public Camera(float minZoom, float maxZoom) {
        this.minZoom = minZoom;
        this.maxZoom = maxZoom;
    }

    public void translate(Vector2D t) {
        translation = translation.add(t);
    }

    public void zoom(float delta) {
        scale = Math.max(minZoom, Math.min(maxZoom, scale + delta));
    }

    public void apply(Graphics2D g) {
        g.translate(-translation.x, -translation.y);
        g.scale(scale, scale);
    }

    public Vector2D apply(Vector2D point) {
        return new Vector2D(
                point.x * (1 / scale),
                point.y * (1 / scale)
        );
    }

    public Vector2D getTranslation() {
        return translation;
    }

    public float getScale() {
        return scale;
    }
}
