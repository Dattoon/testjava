package demoswing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VD5_FlowLayoutFrame extends javax.swing.JFrame {
    public VD5_FlowLayoutFrame() {
        initComponents();
        this.setSize(400, 400);
        for (int i = 0; i < 20; i++) {
            JButton btn = new JButton();
            btn.setPreferredSize(new Dimension(70, 30));
            btn.setText("Text" + i);
            this.getContentPane().add(btn);
        }
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        this.getContentPane().setLayout(layout);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        pack();
    }
 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VD5_FlowLayoutFrame().setVisible(true);
            }
        });
    }
}
