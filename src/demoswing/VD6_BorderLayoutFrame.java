package demoswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VD6_BorderLayoutFrame extends javax.swing.JFrame {
    JButton btnCenter;    JButton btnWest;    JButton btnEast;
    JButton btnNorth;    JButton btnSouth;

    public VD6_BorderLayoutFrame() {
        initComponents();
        btnCenter = new JButton("CENTER");    btnWest = new JButton("WEST");
        btnEast = new JButton("EAST");        btnNorth = new JButton("NORTH");
        btnSouth = new JButton("SOUTH");      btnCenter.setText("CENTER");
        this.setSize(400, 300);    BorderLayout layout = new BorderLayout(10, 20);
        this.getContentPane().setLayout(layout);
        this.getContentPane().add(btnCenter, BorderLayout.CENTER);
        this.getContentPane().add(btnNorth, BorderLayout.NORTH);
        this.getContentPane().add(btnSouth, BorderLayout.SOUTH);
        this.getContentPane().add(btnWest, BorderLayout.WEST);
        this.getContentPane().add(btnEast, BorderLayout.EAST);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        pack();
    }
    //test github
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VD6_BorderLayoutFrame().setVisible(true);
            }
        });
    }
    
    public class DemoSWING {
        public static void main(String[] args) {
            JFrame f = new VD6_BorderLayoutFrame();
            f.setVisible(true);
        }
    }
}


