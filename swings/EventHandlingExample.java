import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample extends JFrame implements MouseListener, ActionListener, MouseMotionListener {
    public EventHandlingExample() {
        setTitle("Mouse Listener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this); // Add MouseMotionListener to the panel

        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        
        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
        this.setTitle("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered!");
        this.setTitle("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited!");
        this.setTitle("Mouse Exited!");
    }

    // Implement MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Button clicked!");
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventHandlingExample::new);
    }
}