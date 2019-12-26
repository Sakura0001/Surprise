package AAAAAAAAAAAAAA;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

class truexiugai extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private Viewimage image;
    private JLabel lblNewLabel_1;
    private Viewimage image2;
    private JLabel lblNewLabel_2;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    truexiugai frame = new truexiugai();
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
    public truexiugai() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 607, 412);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        image = new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\HZ7QEOJ@)G{ADTT7MJHDKY7.png");
        image.setBounds(27, 45, 213, 228);
        contentPane.add(image);

        lblNewLabel_2 = new JLabel("\u606D\u559C\u60A8\u4FEE\u6539\u6210\u529F");
        lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        lblNewLabel_2.setForeground(new Color(255, 192, 203));
        lblNewLabel_2.setBounds(304, 59, 190, 46);
        contentPane.add(lblNewLabel_2);


        image2 = new Viewimage();
        image2.setImageFile("C:\\Users\\asus\\Desktop\\cc48b331f2dd6edc0c42d3347b84395c.jpg");
        image2.setBounds(218, 10, 295, 162);
        contentPane.add(image2);

        JButton btnNewButton = new JButton("\u8FD4\u56DE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4\u56DE.png"));
        btnNewButton.setBounds(182, 283, 218, 69);
        contentPane.add(btnNewButton);
    }
}
