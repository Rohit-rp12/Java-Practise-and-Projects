import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentProfilePage extends JFrame {

    private JDesktopPane desktopPane;

    public StudentProfilePage() {
        // Set up the frame
        setTitle("Student Profile Page");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create desktop pane
        desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create menus
        JMenu windowMenu = new JMenu("Window");
        menuBar.add(windowMenu);

        // Create menu items
        JMenuItem cascadeItem = new JMenuItem("Cascade");
        JMenuItem tileItem = new JMenuItem("Tile");
        windowMenu.add(cascadeItem);
        windowMenu.add(tileItem);

        // Add action listeners
        cascadeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cascadeFrames();
            }
        });

        tileItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tileFrames();
            }
        });

        // Add internal frames
        addInternalFrame("Personal Information");
        addInternalFrame("Academic Information");
        addInternalFrame("Contact Information");

        setVisible(true);
    }

    private void addInternalFrame(String title) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(300, 300);
        internalFrame.setLocation(30 * (desktopPane.getAllFrames().length), 30 * (desktopPane.getAllFrames().length));
        internalFrame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        if (title.equals("Personal Information")) {
            panel.add(new JLabel("Name:"));
            panel.add(new JTextField(20));
            panel.add(new JLabel("Age:"));
            panel.add(new JTextField(3));
            panel.add(new JLabel("Gender:"));
            String[] genders = {"Male", "Female", "Other"};
            JComboBox<String> genderBox = new JComboBox<>(genders);
            panel.add(genderBox);
        } else if (title.equals("Academic Information")) {
            panel.add(new JLabel("Major:"));
            panel.add(new JTextField(20));
            panel.add(new JLabel("GPA:"));
            panel.add(new JTextField(4));
            panel.add(new JLabel("Graduation Year:"));
            panel.add(new JTextField(4));
        } else if (title.equals("Contact Information")) {
            panel.add(new JLabel("Email:"));
            panel.add(new JTextField(20));
            panel.add(new JLabel("Phone:"));
            panel.add(new JTextField(10));
            panel.add(new JLabel("Address:"));
            panel.add(new JTextField(30));
        }

        internalFrame.add(panel);
        desktopPane.add(internalFrame);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }

    private void cascadeFrames() {
        JInternalFrame[] frames = desktopPane.getAllFrames();
        int x = 0, y = 0;
        for (int i = frames.length - 1; i >= 0; i--) {
            frames[i].setLocation(x, y);
            x += 30;
            y += 30;
        }
    }

    private void tileFrames() {
        JInternalFrame[] frames = desktopPane.getAllFrames();
        int rows = (int) Math.sqrt(frames.length);
        int cols = (int) Math.ceil((double) frames.length / rows);
        Dimension size = desktopPane.getSize();
        int w = size.width / cols;
        int h = size.height / rows;
        int x = 0;
        int y = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols && (i * cols + j) < frames.length; j++) {
                frames[i * cols + j].setLocation(x, y);
                frames[i * cols + j].setSize(w, h);
                x += w;
            }
            y += h;
            x = 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentProfilePage();
            }
        });
    }
}
