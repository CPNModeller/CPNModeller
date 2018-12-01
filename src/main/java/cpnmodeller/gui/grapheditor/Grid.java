package cpnmodeller.gui.grapheditor;

import javax.swing.*;
import java.awt.*;

public final class Grid {
    private final JPanel editor;
    private final Camera camera;

    private Color gridColor;
    private int size;

    public Grid(JPanel editor, Camera camera) {
        this(editor, camera, Color.GRAY);
    }

    public Grid(JPanel editor, Camera camera, Color gridColor) {
        this(editor, camera, gridColor, 50);
    }

    public Grid(JPanel editor, Camera camera, Color gridColor, int size) {
        this.editor = editor;
        this.camera = camera;

        this.gridColor = gridColor;
        this.size = size;
    }

    public void draw(Graphics2D g) {
        g.setColor(gridColor);

        final int gridOffsetX = (int) camera.getTranslation().x % size;
        final int gridOffsetY = (int) camera.getTranslation().y % size;

        final int screenWidth = editor.getWidth();
        final int screenHeight = editor.getHeight();

        for (int x = -1; x < screenWidth; x += size) {
            g.drawLine(
                    x + gridOffsetX,
                    0,
                    x + gridOffsetX,
                    screenHeight
            );
        }

        for (int y = -1; y < screenHeight; y += size) {
            g.drawLine(
                    0,
                    y + gridOffsetY,
                    screenWidth,
                    y + gridOffsetY
            );
        }
    }
}
