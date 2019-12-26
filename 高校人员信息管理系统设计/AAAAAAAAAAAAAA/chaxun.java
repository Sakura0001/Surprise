package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;

class chaxun extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    chaxun frame = new chaxun();
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
    public chaxun() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 571, 355);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u67E5\u8BE2\u7528\u6237\uFF1A\r\n");
        lblNewLabel.setFont(new Font("ËÎÌå", Font.BOLD | Font.ITALIC, 17));
        lblNewLabel.setBounds(205, 22, 111, 45);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(205, 104, 175, 29);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("\u901A\u8FC7\u7F16\u53F7\u67E5\u8BE2\uFF1A\r\n");
        lblNewLabel_1.setBounds(78, 104, 98, 29);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("\u67E5\u8BE2");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u67E5\u8BE2.png"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String id = textField.getText();
                mysql m = new mysql();
                try {
                    m.chaxun1(id);
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(409, 104, 110, 29);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_2 = new JLabel("\u901A\u8FC7\u59D3\u540D\u67E5\u8BE2\uFF1A\r\n");
        lblNewLabel_2.setBounds(78, 156, 98, 29);
        contentPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBounds(205, 157, 175, 28);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton_1 = new JButton("\u67E5\u8BE2");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u67E5\u8BE2.png"));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                String name = textField_1.getText();
                mysql m = new mysql();
                try {
                    m.chaxun2(name);
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton_1.setBounds(409, 156, 110, 29);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();

            }
        });
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\Í¼±ê\\\u8FD4 \u56DE.png"));
        btnNewButton_2.setBounds(106, 230, 138, 56);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("\u9000\u51FA");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9000\u51FA.png"));
        btnNewButton_3.setBounds(319, 230, 147, 56);
        contentPane.add(btnNewButton_3);

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\14LKCZQ)6~CEVG1KSXP9JGC.png"));
        lblNewLabel_3.setBounds(0, 0, 555, 324);
        contentPane.add(lblNewLabel_3);
    }

}
