package demoswing;

import java.awt.GridLayout;
import javax.swing.JButton;

public class VD8_GridLayoutFrame extends javax.swing.JFrame {
    private JButton[] jbts;

    public VD8_GridLayoutFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(7, 3);
        this.setSize(700, 400);
        this.setLayout(layout);

        
        this.jbts = new JButton[21];
        for (int i = 0; i < 21; i++) {
            this.jbts[i] = new JButton();
            this.jbts[i].setText(String.valueOf(i + 1));
            this.getContentPane().add(this.jbts[i]);
        }
        pack();
    }

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VD8_GridLayoutFrame().setVisible(true);
            }
        });
    }
}
