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
import java.sql.SQLException;

class shanchu2 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private Viewimage image;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_1;
    private Viewimage image2;
    private JLabel lblNewLabel_2;
    /**
     * Launch the application.
     * */
    public  void play(String s ,String s1) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shanchu2 frame = new shanchu2(s,s1);
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
    public shanchu2(String s,String s1) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 607, 412);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                mysql m = new mysql();
                try {
                    if(m.denglu(s,s1)==1){
                        m.del2(s,s1);
                        trueshanchu2 q = new trueshanchu2();
                        q.play();
                    }
                    else{
                        notshanchu m1 = new notshanchu();
                        m1.play();
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\WGX{@{@Q{%E%6[G6{3P](H5.jpg"));
        btnNewButton.setBounds(85, 301, 190, 62);
        contentPane.add(btnNewButton);

        image = new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\HZ7QEOJ@)G{ADTT7MJHDKY7.png");
        image.setBounds(27, 45, 213, 228);
        contentPane.add(image);

        btnNewButton_1 = new JButton("\u6084\u6084\u8FD4\u56DE");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m =new login();
                m.play();
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4\u56DE.png"));
        btnNewButton_1.setBounds(342, 301, 203, 62);
        contentPane.add(btnNewButton_1);

        lblNewLabel_2 = new JLabel("\u60A8\u4E0D\u5728\u8003\u8651\u4E00\u4E0B\u5417QWQ");
        lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
        lblNewLabel_2.setForeground(new Color(255, 192, 203));
        lblNewLabel_2.setBounds(281, 57, 190, 46);
        contentPane.add(lblNewLabel_2);


        image2 = new Viewimage();
        image2.setImageFile("C:\\Users\\asus\\Desktop\\cc48b331f2dd6edc0c42d3347b84395c.jpg");
        image2.setBounds(218, 10, 295, 162);
        contentPane.add(image2);
    }

}
