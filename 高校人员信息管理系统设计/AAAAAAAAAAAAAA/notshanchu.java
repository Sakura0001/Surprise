package AAAAAAAAAAAAAA;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 class notshanchu extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    notshanchu frame = new notshanchu();
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
    public notshanchu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("É¾³ý\u7684\u7528\u6237\u4E0D\u5B58\u5728");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9519\u8BEF.png"));
        lblNewLabel.setBounds(138, 54, 172, 91);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("\u8FD4\u56DE\u4E0A\u4E00\u7EA7");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m1=new login();
                m1.play();
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton.setBounds(70, 155, 131, 48);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("\u8FD4\u56DE\u4E3B\u9875\r\n");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                shanchu3 m1=new shanchu3();
                m1.play();
            }
        });
        btnNewButton_1.setBounds(260, 155, 131, 48);
        contentPane.add(btnNewButton_1);
    }

}
