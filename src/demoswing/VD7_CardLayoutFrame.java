package demoswing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VD7_CardLayoutFrame extends javax.swing.JFrame {
    private JPanel jpnchoice;
    private JPanel jpnCards;
    private JButton jbtCard1;
    private JPanel jpnCard1;
    private JButton jbt11;
    private JButton jbt12;
    private JButton jbtCard2;
    private JPanel jpnCard2;
    private JButton jbt21;
    private JButton jbt22;

    public VD7_CardLayoutFrame() {
        initComponents();

        this.setSize(300, 120);
        this.setTitle("CardLayout");
        this.setLayout(new BorderLayout());

        // jpnChoice
        this.jpnchoice = new JPanel();
        this.jpnchoice.setLayout(new FlowLayout());
        this.getContentPane().add(this.jpnchoice, BorderLayout.NORTH);
        this.jpnchoice.setBackground(Color.BLUE);

        // jbtCard1
        this.jbtCard1 = new JButton("Card1");
        this.jbtCard1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbtCard1ActionPerformed(e);
            }
        });
        this.jpnchoice.add(this.jbtCard1);

        // jbtCard2
        this.jbtCard2 = new JButton("Card2");
        this.jbtCard2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbtCard2ActionPerformed(e);
            }
        });
        this.jpnchoice.add(this.jbtCard2);

        // jpnCards
        this.jpnCards = new JPanel();
        this.jpnCards.setLayout(new CardLayout());
        this.getContentPane().add(this.jpnCards, BorderLayout.CENTER);

        // jpnCard1
        this.jpnCard1 = new JPanel();
        this.jpnCard1.setName("Card1");
        this.jpnCard1.setBackground(Color.WHITE);
        this.jpnCard1.setLayout(new FlowLayout());
        this.jpnCards.add(this.jpnCard1, this.jpnCard1.getName());

        // jbt11
        this.jbt11 = new JButton("Button 1-1");
        this.jpnCard1.add(this.jbt11);

        // jbt12
        this.jbt12 = new JButton("Button 1-2");
        this.jpnCard1.add(this.jbt12);

        // jpnCard2
        this.jpnCard2 = new JPanel();
        this.jpnCard2.setName("Card2");
        this.jpnCard2.setBackground(Color.YELLOW);
        this.jpnCard2.setLayout(new FlowLayout());
        this.jpnCards.add(this.jpnCard2, this.jpnCard2.getName());

        // jbt21
        this.jbt21 = new JButton("Button 2-1");
        this.jpnCard2.add(this.jbt21);

        // jbt22
        this.jbt22 = new JButton("Button 2-2");
        this.jpnCard2.add(this.jbt22);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        pack();
    }

    private void jbtCard1ActionPerformed(ActionEvent e) {
        CardLayout layout = (CardLayout)this.jpnCards.getLayout();
        layout.show(this.jpnCards, jpnCard1.getName());
    }

    private void jbtCard2ActionPerformed(ActionEvent e) {
        CardLayout layout = (CardLayout)this.jpnCards.getLayout();
        layout.show(this.jpnCards, jpnCard2.getName());
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VD7_CardLayoutFrame().setVisible(true);
            }
        });
    }
}
