package AAAAAAAAAAAAAA;

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
import javax.swing.JTextField;

class shanchu3 extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private Viewimage image;
    private JLabel lblNewLabel_1;
    private Viewimage image2;
    private JLabel lblNewLabel_2;
    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    shanchu3 frame = new shanchu3();
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
    public shanchu3() {
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


        lblNewLabel_2 = new JLabel("\u8BF7\u8F93\u5165\u60A8\u8981\u5220\u9664\u7684id\u6216\u540D\u5B57QWQ");
        lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
        lblNewLabel_2.setForeground(new Color(255, 192, 203));
        lblNewLabel_2.setBounds(260, 30, 232, 46);
        contentPane.add(lblNewLabel_2);


        image2 = new Viewimage();
        image2.setImageFile("C:\\Users\\asus\\Desktop\\cc48b331f2dd6edc0c42d3347b84395c.jpg");
        image2.setBounds(218, -14, 295, 162);
        contentPane.add(image2);

        textField = new JTextField();
        textField.setBounds(260, 157, 174, 31);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(260, 198, 174, 31);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        btnNewButton = new JButton("\u5220\u9664\u6B64id");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String t=textField.getText();
                shanchu2 m = new shanchu2(t,t);
                m.play(t,t);
            }
        });
        btnNewButton.setBounds(462, 158, 108, 30);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("\u5220\u9664\u6B64\u59D3\u540D");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String t=textField_1.getText();
                shanchu2 m = new shanchu2(t,t);
                m.play(t,t);
            }
        });
        btnNewButton_1.setBounds(462, 198, 108, 31);
        contentPane.add(btnNewButton_1);

        btnNewButton_2 = new JButton("\u8FD4\u56DE\r\n");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();
            }
        });
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton_2.setBackground(new Color(255, 255, 255));
        btnNewButton_2.setBounds(189, 283, 203, 46);
        contentPane.add(btnNewButton_2);
    }

}
