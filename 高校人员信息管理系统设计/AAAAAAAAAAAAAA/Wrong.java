package AAAAAAAAAAAAAA;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

class Wrong extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Wrong frame = new Wrong();
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
    public Wrong() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 488, 358);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel = new JLabel("\u64CD\u4F5C\u5B58\u5728\u9519\u8BEF\uFF0C\u70B9\u51FB\u8FD4\u56DE\u4E3B\u9875\u3002\r\n");
        lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setBounds(95, 159, 289, 64);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u5931\u8D25.png"));
        lblNewLabel_1.setBounds(132, 0, 187, 169);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("\u8FD4\u56DE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9000\u51FA.png"));
        btnNewButton.setBounds(132, 233, 187, 49);
        contentPane.add(btnNewButton);
    }
}
