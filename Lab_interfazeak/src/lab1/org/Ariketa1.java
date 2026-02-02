package lab1.org;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Ariketa1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ariketa1 frame = new Ariketa1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ariketa1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        contentPane.setLayout(new GridLayout(10, 10, 2, 2)); 
        matrizeakSortu();
    }

    private void matrizeakSortu() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                JButton btn = new JButton(i + "," + j); 
                contentPane.add(btn);
            }
        }
    }
}