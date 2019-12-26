package AAAAAAAAAAAAAA;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

class shanchu extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public void play(String s) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shanchu frame = new shanchu(s);
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
    public shanchu(String s) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u60A8\u786E\u5B9A\u8981\u5220\u9664\u8FD9\u6761\u4FE1\u606F\u5417\uFF1F");
        lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u5220 \u9664.png"));
        lblNewLabel.setBounds(58, 48, 339, 85);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mysql m1= new mysql();
                try {
                    m1.del(s);
                    dispose();
                    trueshanchu m = new trueshanchu();
                    m.play();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\yes.png"));
        btnNewButton.setBounds(94, 156, 104, 47);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                chaxun q = new chaxun();
                q.play();
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\no.png"));
        btnNewButton_1.setBounds(241, 156, 104, 47);
        contentPane.add(btnNewButton_1);
    }

}
