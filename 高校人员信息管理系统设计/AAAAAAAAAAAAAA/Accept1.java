package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

class Accept1 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private Viewimage lblimg;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Accept1 frame = new Accept1();
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
    public Accept1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\00`DSUU~HEX}YHAXU_V5)Z8.png"));
        btnNewButton.setBounds(10, 200, 414, 51);
        contentPane.add(btnNewButton);

        lblimg = new Viewimage();
        lblimg.setImageFile("C:\\Users\\asus\\Desktop\\MY[CMCL6OZW)3PHRA{5U(CM.png");
        lblimg.setBounds(0, 0, 434, 261);
        contentPane.add(lblimg);


    }
}
