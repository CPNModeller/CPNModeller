package cpnmodeller.gui.grapheditor;

import cpnmodeller.math.Vector2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GraphEditorPanel extends JPanel implements MouseMotionListener, MouseListener {

    private final Grid grid;
    private final Camera camera;
    private final NodeCollection nodeCollection;

    private Color backgroundColor;

    private Vector2D lastPoint = new Vector2D(0, 0);

    public GraphEditorPanel(){
        camera = new Camera();
        grid = new Grid(this, camera);
        nodeCollection = new NodeCollection();

        backgroundColor = Color.LIGHT_GRAY;

        setBackground(backgroundColor);
        setPreferredSize(new Dimension(500, 300));

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        final Graphics2D g2d = (Graphics2D) g;
        grid.draw(g2d);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point point = e.getPoint();
        Vector2D position = camera.apply(new Vector2D(point.x, point.y));
        System.out.println(position);

        if (SwingUtilities.isMiddleMouseButton(e)) {
            Vector2D delta = lastPoint.subtract(position);
            camera.translate(delta);
            repaint();
        }

        lastPoint = new Vector2D(point.x, point.y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
