package BaiTap;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VD2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VD2 frame = new VD2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public VD2() {
        super("Demo Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

      
        contentPane.setLayout(new FlowLayout());

        JPanel pnFlow = new JPanel(new FlowLayout());
        pnFlow.setBackground(Color.PINK);

       
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("Het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");

        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);

       
        contentPane.add(pnFlow);
    }
}
